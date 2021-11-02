package home.inside.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/mgr/error.do")
	public String mgrErrView() throws Exception{
		return "error/managerException";
	}
	
	@RequestMapping("/manager/main.do")
	public String mgrMainView() throws Exception{
		return "manager/main/main";
	}
	
	@RequestMapping("/inside/main.do")
	public String userView() throws Exception{
		return "user/main/main";
	}
	
	@RequestMapping(value = "/info/identify.do")
	public String identify() throws Exception {
		return "user/member/mypage/identify";
	}
}
