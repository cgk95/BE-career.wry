package kr.co.careerwry.domain.member.service;

import java.util.List;

import kr.co.careerwry.domain.member.dtos.MemberCommand;
import kr.co.careerwry.domain.member.dtos.MemberInfo;

public interface MemberService {
  MemberInfo registerMember(MemberCommand command);

  MemberInfo findMemberInfo(String memberToken);

  MemberInfo enableMember(String memberToken);

  MemberInfo banMember(String memberToken);

  MemberInfo disableMember(String memberToken);

  List<MemberInfo> getAllMemberList();
}