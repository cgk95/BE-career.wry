package kr.co.careerwry.infrastructure.oauth;

import kr.co.careerwry.domain.oauth.AuthCodeRequestUrlProvider;
import kr.co.careerwry.domain.oauth.OauthServerType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * 카카오 인가 코드를 요청할 URL 을 생성하는 클래스
 */
@Component
@RequiredArgsConstructor
public class KakaoAuthCodeRequestUrlProvider implements AuthCodeRequestUrlProvider {
    private final KakaoOauthConfig kakaoOauthConfig;

    @Override
    public OauthServerType supportedServer() {
        return OauthServerType.KAKAO;
    }

    @Override
    public String provide() {
        return UriComponentsBuilder
                .fromUriString("https://kauth.kakao.com/oauth/authorize")
                .queryParam("response_type", "code")
                .queryParam("client_id", kakaoOauthConfig.clientId())
                .queryParam("redirect_uri", kakaoOauthConfig.redirectUri())
                .queryParam("scope", String.join(",", kakaoOauthConfig.scope()))
                .queryParam("prompt",String.join(",",kakaoOauthConfig.prompt()))
                .toUriString();
    }
}