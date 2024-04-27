package kr.co.careerwrymember.domain.member.codes;



import kr.co.careerwrymember.common.code.BusinessCode;
import org.springframework.http.HttpStatus;

public enum MemberSuccessCode implements BusinessCode {
  SUCCESS_FIND_MEMBER_INFO(HttpStatus.FOUND.value(), "SCM001", "멤버 정보 조회 성공"),
  SUCCESS_MEMBER_REGISTER(HttpStatus.OK.value(), "SCM002", "멤버 회원 가입 성공");


  private final int status;
  private final String code;
  private final String message;

  MemberSuccessCode(int status, String code, String message) {
	this.status = status;
	this.code = code;
	this.message = message;
  }

  @Override
  public int getStatus() {
	return status;
  }

  @Override
  public String getCode() {
	return code;
  }

  @Override
  public String getMessage() {
	return message;
  }
}