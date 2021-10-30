package home.inside.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String registForm(RegistCommand cmd, Model model) throws Exception {
		model.addAttribute("regCmd", new RegistCommand());
		return "user/member/registForm";
	}

	@RequestMapping(value = "/regist.do", method = RequestMethod.POST)
	public String registSubmit(@ModelAttribute("regCmd") RegistCommand regCmd, Errors errors) throws Exception {
		new RegistCommandValidator().validate(regCmd, errors);
		if (errors.hasErrors()) {
			return "user/member/registForm";
		}
		if (regSer.emailCheck(regCmd.getEmail()) > 0) {
			errors.rejectValue("email", "overlap");
			return "user/member/registForm";
		}
		if (regSer.nicknameCheck(regCmd.getNickname()) > 0) {
			errors.rejectValue("nickname", "overlap");
			return "user/member/registForm";
		}
		regSer.registMember(regCmd);
		return "user/member/loginForm";
	}

}
