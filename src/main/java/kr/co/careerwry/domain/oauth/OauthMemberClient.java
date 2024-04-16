package kr.co.careerwry.domain.oauth;

public interface OauthMemberClient {

    OauthServerType supportServer();

    OauthMember fetch(String code);
}
