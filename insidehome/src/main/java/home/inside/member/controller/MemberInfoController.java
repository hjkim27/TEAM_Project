package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.inside.common.service.IPointService;
import home.inside.member.service.IMemberInfoService;

@Controller
@RequestMapping("/user/mypage")
public class MemberInfoController {
	@Autowired
	private IMemberInfoService infoSer;
	@Autowired
	private IPointService pointSer;
	// prvate IWarnService warnSer;
	
	
	@RequestMapping(value = "/main.do")
	public String mypage() throws Exception {
		return "user/member/mypage/mypageMain";
	}

	@RequestMapping(value = "/info/view.do")
	public String myInfo() throws Exception {
		return "user/member/mypage/memberInfo";
	}

	@RequestMapping(value = "/info/updateForm.do", method = RequestMethod.POST)
	public String infoUpdateForm() throws Exception {
		return "user/member/mypage/changeInfoForm";
	}

	@RequestMapping(value = "/info/update.do", method = RequestMethod.POST)
	public String infoUpdateSubmit() throws Exception {
		return "user/member/mypage/memberInfo";
	}

	@RequestMapping(value = "/changePwForm.do")
	public String changePwForm() throws Exception {
		return "user/member/mypage/changePwForm";
	}

	@RequestMapping(value = "/changePw.do", method = RequestMethod.POST)
	public String changePwSubmit() throws Exception {
		return "user/member/mypage/memberInfo";
	}

}
