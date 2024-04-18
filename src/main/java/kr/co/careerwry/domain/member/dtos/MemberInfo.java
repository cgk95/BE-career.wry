package kr.co.careerwry.domain.member.dtos;

import kr.co.careerwry.domain.member.entity.Member;
import lombok.Builder;
import lombok.Getter;


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