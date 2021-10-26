package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.inside.member.service.IRegistService;

@Controller
@RequestMapping("/inside")
public class RegistController {
	@Autowired
	private IRegistService regSer;
	
	@RequestMapping("/registForm.do")
	public String registForm() throws Exception{
		return "user/member/registForm";
	}
	
	@RequestMapping(value="/regist.do",method = RequestMethod.POST)
	public String registSubmit() throws Exception{
		return "user/member/loginForm";
	}
	
}
