package kr.co.careerwrymember.infrastructure.member;


import kr.co.careerwrymember.domain.member.entity.Member;
import kr.co.careerwrymember.domain.member.service.MemberReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberReaderImpl implements MemberReader {

  private final MemberRepository memberRepository;

  @Override
  public Optional<Member> findByMemberToken(String token) {
	return memberRepository.findByMemberToken(token);
  }

  @Override
  public Optional<Member> findByEmail(String email) {
	return memberRepository.findByEmail(email);
  }

  @Override
  public Optional<Member> findByNickName(String nickName) {
	return memberRepository.findByNickName(nickName);
  }

  @Override
  public List<Member> getAllMemberList() {
	return memberRepository.findAll();
  }
}