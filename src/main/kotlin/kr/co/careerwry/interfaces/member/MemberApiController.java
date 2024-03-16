package kr.co.careerwry.interfaces.member;

import java.util.List;
import kr.co.careerwry.common.ApiResponse;
import kr.co.careerwry.domain.member.codes.MemberSuccessCode;
import kr.co.careerwry.domain.member.dtos.MemberInfo;
import kr.co.careerwry.domain.member.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberServiceImpl memberService;

    @PostMapping("")
    public ResponseEntity<ApiResponse<Object>> register(@RequestBody MemberDto.RegisterRequest request) {
        MemberInfo responseInfo = memberService.registerMember(request.toCommand());

        return ApiResponse
                .toResponseEntity(MemberSuccessCode.SUCCESS_MEMBER_REGISTER, MemberDto.RegisterResponse.fromInfo(responseInfo));
    }

    @GetMapping("")
    public ResponseEntity<ApiResponse<Object>> getAllMemberList(){
        List<MemberInfo> memberList = memberService.getAllMemberList();
        return ApiResponse.toResponseEntity(MemberSuccessCode.SUCCESS_FIND_MEMBER_INFO, memberList);
    }
}
