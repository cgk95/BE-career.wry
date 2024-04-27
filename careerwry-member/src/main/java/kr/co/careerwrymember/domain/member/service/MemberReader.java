package kr.co.careerwrymember.domain.member.service;



import kr.co.careerwrymember.domain.member.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberReader {
  Optional<Member> findByMemberToken(String token);

  Optional<Member> findByEmail(String email);

  Optional<Member> findByNickName(String nickName);

  List<Member> getAllMemberList();
}