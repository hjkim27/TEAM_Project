package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.inside.member.service.EmailService;
import home.inside.member.vo.EmailVo;

@Controller
public class EmailController {
	@Autowired
	private EmailService service;
	
	@RequestMapping(value="/inside/email.do", method = RequestMethod.POST)
	public String submit(EmailVo email) throws Exception {
		email.setReceiver("aa8276@kakao.com");
		email.setSubject("test");
		email.setContent("java에서 발송 테스트");
		service.emailSend(email);
		return "/user/member/findInfoSuccess";
	}
}
