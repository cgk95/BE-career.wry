package kr.co.careerwrymember.domain.member.entity;


import jakarta.persistence.*;
import kr.co.careerwrymember.common.utils.TokenGenerator;
import kr.co.careerwrymember.domain.AbstractEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

@Slf4j
@Entity
@Getter
@Table(name = "members")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends AbstractEntity {

  private static final String PREFIX_MEMBER = "mbr_";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false, unique = true)
  private String memberToken;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String nickName;
  //TODO :: 값 타입으로 성별, 연령대, 가입 플랫폼 타입 지정하기

  @Builder
  private Member(String email, String nickName) {
	if (!StringUtils.hasLength(email)) {
	  throw new RuntimeException();
	}
	if (!StringUtils.hasLength(nickName)) {
	  throw new RuntimeException();
	}

	this.memberToken = TokenGenerator.randomCharacterWithPrefix(PREFIX_MEMBER);
	this.email = email;
	this.nickName = nickName;
  }

  public static Member toEntity(String email, String nickName) {

	return Member.builder()
				 .email(email)
				 .nickName(nickName)
				 .build();
  }

  //** method **//
  public void changeNickName(String nickName) {
	this.nickName = nickName;
  }

}