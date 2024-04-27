package kr.co.careerwrymember.application.member;


import kr.co.careerwrymember.domain.member.dtos.MemberCommand;
import kr.co.careerwrymember.domain.member.dtos.MemberInfo;
import kr.co.careerwrymember.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberFacade {

  private final MemberService memberService;

  public MemberInfo registerMember(MemberCommand command) {

	return memberService.registerMember(command);
  }
}