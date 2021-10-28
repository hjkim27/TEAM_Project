package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.inside.member.service.ILoginService;
import home.inside.member.service.IMemberInfoService;

@Controller
@RequestMapping("/member")
public class LoginController {
	@Autowired
	private ILoginService logSer;
	@Autowired
	private IMemberInfoService infoSer;
	
	@RequestMapping(value = "/loginForm.do")
	public String loginForm() throws Exception {
		return "user/member/loginForm";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginSubmit() throws Exception {
		return null;
	}

	@RequestMapping(value = "/logout.do")
	public String logoutSubmit() throws Exception {
		return "user/main/main";
	}

	@RequestMapping(value = "/IdentifyForm.do")
	public String identifyForm() throws Exception {
		return "user/member/IdentifyForm";
	}

	@RequestMapping(value = "/Identify.do", method = RequestMethod.POST)
	public String identifySubmit() throws Exception {
		return null;
	}

	@RequestMapping(value = "/searchForm.do")
	public String findInfoForm() throws Exception {
		return "user/member/findInfoForm";
	}

	@RequestMapping(value = "/search.do", method = RequestMethod.POST)
	public String findInfoSubmit() throws Exception {
		return "user/member/findInfoResult";
	}

}
