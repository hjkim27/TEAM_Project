package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import home.inside.member.service.IRegistService;
import home.inside.member.util.RegistCommand;
import home.inside.member.util.RegistCommandValidator;
import home.inside.member.vo.MemberAddrVo;

@Controller
@RequestMapping("/inside")
public class RegistController {
	@Autowired
	private IRegistService regSer;
	
	@RequestMapping("/registForm.do")
	public String registForm(RegistCommand cmd, Model model) throws Exception{
		model.addAttribute("regCmd", new RegistCommand());
		return "user/member/registForm";
	}
	
	@ResponseBody
	@RequestMapping(value = "/registCheck.do", method = RequestMethod.POST)
	public int registCheck(String email, String nickname) throws Exception{
		return regSer.overlapCheck(email, nickname);
	}
	
	@RequestMapping(value="/regist.do",method = RequestMethod.POST)
	public String registSubmit(@ModelAttribute("regCmd")RegistCommand regCmd, Errors errors) {
		System.out.println(regCmd);
		new RegistCommandValidator().validate(regCmd, errors);
		if(errors.hasErrors()) {
			System.out.println("error!");
			return "user/member/registForm";
		}
		try {
			int result = regSer.overlapCheck(regCmd.getEmail(), regCmd.getNickname());
			if(result>0) {
				System.out.println("이메일중복");
				errors.rejectValue("email", "overlap");
				return "user/member/registForm";
			}
		} catch (Exception e) {}
		System.out.println("test");
		return "user/member/loginForm";
	}
	
}
