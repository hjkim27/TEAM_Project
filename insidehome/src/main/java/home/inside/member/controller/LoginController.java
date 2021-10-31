package home.inside.member.controller;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.inside.member.service.ILoginService;
import home.inside.member.service.IMemberInfoService;
import home.inside.member.util.LoginCommand;
import home.inside.member.util.LoginCommandValidator;

@Controller
@RequestMapping("/member")
public class LoginController {
	@Autowired
	private ILoginService logSer;
	@Autowired
	private IMemberInfoService infoSer;

	@RequestMapping(value = "/loginForm.do")
	public String loginForm(@ModelAttribute("cmd")LoginCommand cmd, Model model,
			@CookieValue(value = "inssahouse", required = false) Cookie rememberCookie, HttpSession session)
			throws Exception {
		if (rememberCookie != null) {
			String sessionId = rememberCookie.getValue();
			HashMap<String, Object> hsm = logSer.loginOptionCheck(sessionId);
			if (hsm != null) {
				if (hsm.get("SESSIONID") != null && !hsm.get("SESSIONID").equals("")) {
					session.setAttribute("loginInside", hsm);
					System.out.println("><");
					return "user/main/main";
				} else {
					cmd.setEmail((String) hsm.get("EMAIL"));
					cmd.setLoginOption("rememberEmail");
				}
			}
		} else {
			cmd = new LoginCommand();
		}
		model.addAttribute("cmd", cmd);
		System.out.println(cmd);
		return "user/member/loginForm";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginSubmit(@ModelAttribute("cmd")LoginCommand cmd, Errors errors, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		new LoginCommandValidator().validate(cmd, errors);
		if (errors.hasErrors()) {
			return "user/member/loginForm";
		}
		String nickname = logSer.loginOrIdentifyRequest(cmd.getEmail(), cmd.getPassword());
		if (nickname == null || nickname.equals("")) {
			ValidationUtils.rejectIfEmpty(errors, "email", "notmatch");
			int failCount = cmd.getFailCount();
			if (failCount == 2) {
				return "user/member/findInfoForm";
			} else {
				cmd.setFailCount(failCount + 1);
			}
			System.out.println("로그인 실패" + (cmd.getFailCount() + 1));
			return "user/member/loginForm";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("loginInside", nickname);
			String sessionId = session.getId();
			System.out.println("sessionId"+ sessionId);
			Cookie rememberCookie = new Cookie("inssahouse", sessionId);
			rememberCookie.setPath("/");
			if (cmd.getLoginOption() != null && !cmd.getLoginOption().equals("")) {
				rememberCookie.setMaxAge(60 * 60 * 24 * 7);
				if (cmd.getLoginOption().equals("autoLogin")) {
					logSer.loginSuccess(cmd.getEmail(), sessionId);
				}
			} else {
				
				rememberCookie.setMaxAge(0);
				logSer.loginSuccess(cmd.getEmail(), null);
			}
			resp.addCookie(rememberCookie);
		}
		System.out.println("로그인성공: " + cmd);
		return "user/main/main";
	}

	@RequestMapping(value = "/logout.do")
	public String logoutSubmit(HttpSession session) throws Exception {
		session.invalidate();
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
