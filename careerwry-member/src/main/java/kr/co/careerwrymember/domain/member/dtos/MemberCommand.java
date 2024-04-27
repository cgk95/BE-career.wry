package kr.co.careerwrymember.domain.member.dtos;


import kr.co.careerwrymember.domain.member.entity.Member;
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