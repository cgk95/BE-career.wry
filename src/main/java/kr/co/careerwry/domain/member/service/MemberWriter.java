package kr.co.careerwry.domain.member.service;

import kr.co.careerwry.domain.member.entity.Member;

public interface MemberWriter {
  Member save(Member member);

  Member update(Member member);
}