package kr.co.careerwry.domain.member.service;

import java.util.List;
import java.util.Optional;

import kr.co.careerwry.domain.member.entity.Member;

public interface MemberReader {
  Optional<Member> findByMemberToken(String token);

  Optional<Member> findByEmail(String email);

  Optional<Member> findByNickName(String nickName);

  List<Member> getAllMemberList();
}