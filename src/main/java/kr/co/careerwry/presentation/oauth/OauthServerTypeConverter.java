package kr.co.careerwry.presentation.oauth;

import kr.co.careerwry.domain.oauth.OauthServerType;

import org.springframework.core.convert.converter.Converter;


public class OauthServerTypeConverter implements Converter<String, OauthServerType> {

    @Override
    public OauthServerType convert(String source) {
        return OauthServerType.fromName(source);
    }

}