package kr.co.careerwry.domain.member.service;

import java.util.List;
import java.util.stream.Collectors;
import kr.co.careerwry.domain.member.dtos.MemberCommand;
import kr.co.careerwry.domain.member.dtos.MemberInfo;
import kr.co.careerwry.domain.member.entity.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberWriter memberWriter;
    private final MemberReader memberReader;

    @Override
    @Transactional
    public MemberInfo registerMember(MemberCommand command) {
        Member newMember = command.toEntity();

        return MemberInfo.fromEntity(memberWriter.save(newMember));
    }

    @Override
    public List<MemberInfo> getAllMemberList() {
        return memberReader.getAllMemberList()
                           .stream().map(MemberInfo::fromEntity)
                           .collect(Collectors.toList());
    }

    @Override
    public MemberInfo findMemberInfo(String memberToken) {
        return memberReader.findByMemberToken(memberToken)
                           .map(MemberInfo::fromEntity)
                           .orElseThrow(() -> new RuntimeException("멤버 못 찾음"));
    }

    //** 멤버 업데이트 로직 **//
    @Override
    public MemberInfo enableMember(String memberToken) {
        return null;
    }

    @Override
    public MemberInfo banMember(String memberToken) {
        return null;
    }

    @Override
    public MemberInfo disableMember(String memberToken) {
        return null;
    }


}
