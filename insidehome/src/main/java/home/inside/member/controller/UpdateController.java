package home.inside.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import home.inside.member.service.IMemberService;
import util.ChangePwCommand;
import util.UpdateInfoCommand;

@Controller
public class UpdateController {
	@Autowired
	private IMemberService memberService;

	// 회원정보 수정페이지 요청
	public String updateForm(Model model, HttpSession session) {
		return null;
	}
	
	// 회원정보 수정처리
	public String updateSubmit(UpdateInfoCommand updateCmd) {
		return null;
	}
	
	// 비밀번호 변경페이지 요청
	public String changePwForm() {
		return null;
	}
	
	// 비밀번호 변경 처리
	public String changePwSubmit(ChangePwCommand cmd, Errors errors) {
		return null;
	}
}
