package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import home.inside.member.service.IMemberInfoService;

@Controller
@RequestMapping("/manager")
public class MemberMgrController {
	@Autowired
	private IMemberInfoService infoSer;

	@RequestMapping(value = "/member/list.do")
	public String memberList(String type, Model model) throws Exception {
		return "manager/member/infoList";
	}
}
