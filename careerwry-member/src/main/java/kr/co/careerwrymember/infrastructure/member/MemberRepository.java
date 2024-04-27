package kr.co.careerwrymember.infrastructure.member;


import kr.co.careerwrymember.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {
  @Query("SELECT m from Member m where m.email=:email")
  Optional<Member> findByEmail(String email);

  @Query("SELECT m FROM Member m WHERE m.memberToken=:token")
  Optional<Member> findByMemberToken(String token);

  @Query("SELECT m FROM Member m WHERE m.nickName=:nickName")
  Optional<Member> findByNickName(String nickName);
}