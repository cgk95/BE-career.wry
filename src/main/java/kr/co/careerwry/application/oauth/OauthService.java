package kr.co.careerwry.application.oauth;

import kr.co.careerwry.domain.oauth.AuthCodeRequestUrlProviderComposite;
import kr.co.careerwry.domain.oauth.OauthMember;
import kr.co.careerwry.domain.oauth.OauthMemberClientComposite;
import kr.co.careerwry.domain.oauth.OauthMemberRepository;
import kr.co.careerwry.domain.oauth.OauthServerType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OauthService {
    private final AuthCodeRequestUrlProviderComposite authCodeRequestUrlProviderComposite;

    private final OauthMemberClientComposite oauthMemberClientComposite;
    private final OauthMemberRepository oauthMemberRepository;


    public String getAuthCodeRequestUrl(OauthServerType oauthServerType) {
        return authCodeRequestUrlProviderComposite.provide(oauthServerType);
    }

    public Long login(OauthServerType oauthServerType, String authCode) {
        OauthMember oauthMember = oauthMemberClientComposite.fetch(oauthServerType, authCode);
        OauthMember saved = oauthMemberRepository.findByOauthId(oauthMember.oauthId())
                .orElseGet(() -> oauthMemberRepository.save(oauthMember));
        return saved.id();
    }

}