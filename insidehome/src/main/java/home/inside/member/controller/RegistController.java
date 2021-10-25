package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;

import home.inside.member.service.IMemberService;
import home.inside.member.vo.MemberAddrVo;
import util.RegistRequireCommand;

@Controller
public class RegistController {

	@Autowired
	private IMemberService memberService;
	
	//회원가입 페이지 요청
	public String registForm() {
		return null;
	}
	
	// 회원가입 시 이메일, 닉네임 중복확인 처리
	public String overlapCheck(String str, String type) {
		return null;
	}
	
	// 회원가입 완료 요청
	public String registSubmit(RegistRequireCommand regCmd, MemberAddrVo addrVo, Errors errors) {
		return null;
	}
}
