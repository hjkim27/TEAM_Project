package home.inside.member.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;

import home.inside.member.service.IMemberService;
import home.inside.member.utils.LoginCommand;

@Controller
public class LoginController {
	@Autowired
	private IMemberService memberService;

	// 로그인페이지 요청
	public String loginForm(LoginCommand cmd, Cookie cookie) {
		return null;
	}
	
	// 로그인 처리
	public String loginSubmit(LoginCommand cmd, Errors errors, HttpSession session, HttpServletResponse resp) {
		return null;
	}
	
	// 로그아웃
	public String logoutSubmit(HttpSession session) {
		return null;
	}
}
