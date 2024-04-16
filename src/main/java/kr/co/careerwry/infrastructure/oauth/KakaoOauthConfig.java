package kr.co.careerwry.infrastructure.oauth;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "oauth.kakao")
public record KakaoOauthConfig(
        String clientId,
        String clientSecret,
        String redirectUri,
        String login_hint,
        String state,
        String nonce,
        String[] scope,
        String[] prompt
) {
}