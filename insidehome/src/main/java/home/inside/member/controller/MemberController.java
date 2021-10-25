package home.inside.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import home.inside.member.service.IMemberService;

@Controller
public class MemberController {
	@Autowired
	private IMemberService memberService;

	// 개인정보 조회
	public String selectInfo(Model model, HttpSession session) {
		return null;
	}
	
	// 회원 목록 조회
	@RequestMapping("/inside/memberList.do")
	public String selectMemberList(String type, Model model) throws Exception {
		type = "normal";
		model.addAttribute("memberList", memberService.selectAllMember(type));
		return "user/main/memberList";
	}
	
	// 아이디/비밀번호찾기페이지 요청
	public String findInfoForm() {
		return null;
	}
	
	// 아이디/비밀번호찾기 처리
	public String findInfoSubmit(String email, String phone, Errors errors) {
		return null;
	}
}
