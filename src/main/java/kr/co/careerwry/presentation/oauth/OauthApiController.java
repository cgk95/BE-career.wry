package kr.co.careerwry.presentation.oauth;

import jakarta.servlet.http.HttpServletResponse;
import kr.co.careerwry.application.oauth.OauthService;
import kr.co.careerwry.domain.oauth.OauthServerType;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
@RequiredArgsConstructor
public class OauthApiController {

    private final OauthService oauthService;

    @SneakyThrows
    @GetMapping("/{oauthServerType}")
    public ResponseEntity<Void> redirectAuthCodeRequestUrl(@PathVariable OauthServerType oauthServerType,
                                                           HttpServletResponse response) {
        String redirectUrl = oauthService.getAuthCodeRequestUrl(OauthServerType.KAKAO);
        response.sendRedirect(redirectUrl);

        return ResponseEntity.status(HttpStatus.PERMANENT_REDIRECT).build();
    }

    @GetMapping("/login/{oauthServerType}")
    ResponseEntity<Long> login(
            @PathVariable OauthServerType oauthServerType,
            @RequestParam("code") String code
    ) {
        Long login = oauthService.login(oauthServerType, code);
        return ResponseEntity.ok(login);
    }
}
