package kr.co.careerwry.domain.oauth;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OauthMemberRepository extends JpaRepository<OauthMember, OauthId> {
    Optional<OauthMember> findByOauthId(OauthId oauthId);
}
