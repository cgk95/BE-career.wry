package kr.co.careerwry.domain.member.dtos;

import kr.co.careerwry.domain.member.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class MemberCommand {
  private String nickName;
  private String email;

  public Member toEntity() {
	return Member.builder()
				 .nickName(nickName)
				 .email(email)
				 .build();

  }
}