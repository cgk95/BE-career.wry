package kr.co.careerwry.application.member;

import org.springframework.stereotype.Service;

import kr.co.careerwry.domain.member.dtos.MemberCommand;
import kr.co.careerwry.domain.member.dtos.MemberInfo;
import kr.co.careerwry.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberFacade {

  private final MemberService memberService;

  public MemberInfo registerMember(MemberCommand command) {

	return memberService.registerMember(command);
  }
}