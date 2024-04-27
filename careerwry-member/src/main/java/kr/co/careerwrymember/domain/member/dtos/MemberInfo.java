package kr.co.careerwrymember.domain.member.dtos;


import kr.co.careerwrymember.domain.member.entity.Member;
import lombok.Builder;


@Builder
public record MemberInfo(Long id, String memberToken, String email, String nickName) {
    public static MemberInfo fromEntity(Member member) {
        return MemberInfo.builder()
                .memberToken(member.getMemberToken())
                .email(member.getEmail())
                .nickName(member.getNickName())
                .build();
    }

}