package kr.co.careerwry.infrastructure.member;

import kr.co.careerwry.domain.member.entity.Member;
import kr.co.careerwry.domain.member.service.MemberWriter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberWriteImpl implements MemberWriter {

    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member update(Member member) {
        return null;
    }
}
