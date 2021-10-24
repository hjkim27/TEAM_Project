package home.inside.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import home.inside.member.utils.SendEmailCommand;

@Controller
public class EmailController {
	
	@RequestMapping
	public String sendEmail(SendEmailCommand vo, Model model) {
		String host = "smtp.naver.com";
		final String username = "qlrmf2470";
		final String password = "qlrmf2470!@";
		int port = 465;
		return null;
	}
}
