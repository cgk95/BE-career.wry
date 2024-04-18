package kr.co.careerwry.domain.member.codes;

import org.springframework.http.HttpStatus;
import kr.co.careerwry.common.code.ErrorCode;

public enum MemberErrorCode implements ErrorCode {

  ERROR_NOT_FOUND_MEMBER_INFO(HttpStatus.NOT_FOUND.value(), "ECM001", "해당하는 가입 회원을 찾을 수 없습니다");
  private final int status;
  private final String code;
  private final String message;

  MemberErrorCode(int status, String code, String message) {
	this.status = status;
	this.code = code;
	this.message = message;
  }

  @Override
  public int getStatus() {
	return this.status;
  }

  @Override
  public String getCode() {
	return this.code;
  }

  @Override
  public String getMessage() {
	return this.message;
  }
}