package kr.co.careerwry.domain.oauth;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class AuthCodeRequestUrlProviderComposite {
    private final Map<OauthServerType, AuthCodeRequestUrlProvider> mapping;

    public AuthCodeRequestUrlProviderComposite(Set<AuthCodeRequestUrlProvider> providers) {
        this.mapping = providers.stream()
                                .collect(Collectors.toMap(AuthCodeRequestUrlProvider::supportedServer,
                                        Function.identity()));
    }

    public String provide(OauthServerType oauthServerType) {
        return getProvider(oauthServerType).provide();
    }

    private AuthCodeRequestUrlProvider getProvider(OauthServerType oauthServerType) {

        return Optional.ofNullable(mapping.get(oauthServerType))
                       .orElseThrow(() -> new IllegalArgumentException("Unsupported oauth server type: " + oauthServerType));
    }


}