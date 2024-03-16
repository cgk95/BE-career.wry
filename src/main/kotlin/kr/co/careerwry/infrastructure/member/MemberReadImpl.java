package kr.co.careerwry.infrastructure.member;

import java.util.List;
import java.util.Optional;
import kr.co.careerwry.domain.member.entity.Member;
import kr.co.careerwry.domain.member.service.MemberReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberReadImpl implements MemberReader {

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
