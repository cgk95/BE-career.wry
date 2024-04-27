package kr.co.careerwrymember.domain.member.service;


import kr.co.careerwrymember.domain.member.entity.Member;

public interface MemberWriter {
  Member save(Member member);

  Member update(Member member);
}