package kr.co.careerwry.interfaces.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import kr.co.careerwry.domain.member.dtos.MemberCommand;
import kr.co.careerwry.domain.member.dtos.MemberInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MemberDto {
    @Getter
    @Setter
    @ToString
    public static class RegisterRequest {

        @JsonProperty(value = "nick_name")
        private String nickName;

        @JsonProperty(value = "email")
        private String email;

        public MemberCommand toCommand() {
            return MemberCommand.builder()
                                .nickName(nickName)
                                .email(email)
                                .build();
        }

    }

    @Getter
    @ToString
    public static class RegisterResponse {
        private final String memberToken;
        private final String email;
        private final String nickName;

        @Builder
        private RegisterResponse(MemberInfo info) {
            this.memberToken = info.memberToken();
            this.email = info.email();
            this.nickName = info.nickName();
        }

        public static RegisterResponse fromInfo(MemberInfo info) {
            return new RegisterResponse(info);
        }
    }
}
