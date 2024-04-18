package kr.co.careerwry.infrastructure.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kr.co.careerwry.domain.member.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {
  @Query("SELECT m from Member m where m.email=:email")
  Optional<Member> findByEmail(String email);

  @Query("SELECT m FROM Member m WHERE m.memberToken=:token")
  Optional<Member> findByMemberToken(String token);

  @Query("SELECT m FROM Member m WHERE m.nickName=:nickName")
  Optional<Member> findByNickName(String nickName);
}