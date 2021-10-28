package home.inside.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	public String mainView() throws Exception{
		return "user/main/main";
	}
	
	@RequestMapping("mgr/error.do")
	public String mgrErrView() throws Exception{
		return "error/managerException";
	}
	
	@RequestMapping("manager/inside/main.dp")
	public String mgrMainView() throws Exception{
		return "manager/main/main";
	}
}
