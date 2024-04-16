package kr.co.careerwry.domain.oauth;

public interface AuthCodeRequestUrlProvider {
    OauthServerType supportedServer();

    String provide();
}