package kr.co.careerwrymember.domain.member.service;



import kr.co.careerwrymember.domain.member.dtos.MemberCommand;
import kr.co.careerwrymember.domain.member.dtos.MemberInfo;

import java.util.List;

public interface MemberService {
  MemberInfo registerMember(MemberCommand command);

  MemberInfo findMemberInfo(String memberToken);

  MemberInfo enableMember(String memberToken);

  MemberInfo banMember(String memberToken);

  MemberInfo disableMember(String memberToken);

  List<MemberInfo> getAllMemberList();
}