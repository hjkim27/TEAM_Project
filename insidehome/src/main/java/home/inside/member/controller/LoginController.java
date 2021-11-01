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
	public String loginForm(@ModelAttribute("cmd") LoginCommand cmd, Model model,
			@CookieValue(value = "inssahouse", required = false) Cookie rememberCookie, HttpSession session)
			throws Exception {
		if (rememberCookie != null) {
			String sessionId = rememberCookie.getValue();
			HashMap<String, Object> info = logSer.loginOptionCheck(sessionId);
			if (info != null) {
				String loginOption = (String) info.get("LOGINOPTION");
				String email = (String) info.get("EMAIL");
				String nickname = (String) info.get("NICKNAME");
				session.setAttribute("loginInside", nickname);
				if (loginOption != null && loginOption.equals("rememberEmail")) {
					cmd.setEmail(email);
					cmd.setLoginOption(loginOption);
				} else if (loginOption != null && loginOption.equals("autoLogin")) {
					logSer.loginSuccess(email, sessionId, loginOption);
					return "user/main/main";
				}
			}
		} else {
			cmd = new LoginCommand();
		}
		model.addAttribute("cmd", cmd);
		return "user/member/loginForm";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginSubmit(@ModelAttribute("cmd") LoginCommand cmd, Errors errors, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		new LoginCommandValidator().validate(cmd, errors);
		if (errors.hasErrors()) {
			return "user/member/loginForm";
		}
		String nickname = logSer.loginOrIdentifyRequest(cmd.getEmail(), cmd.getPassword());
		if (nickname == null || nickname.equals("")) {
			errors.rejectValue("email", "notmatch");
			return "user/member/loginForm";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("loginInside", nickname);
			String sessionId = session.getId();
			if (cmd.getLoginOption() != null && !cmd.getLoginOption().equals("")) {
				Cookie rememberCookie = new Cookie("inssahouse", sessionId);
				rememberCookie.setPath("/");
				rememberCookie.setMaxAge(60 * 60 * 24 * 7);
				resp.addCookie(rememberCookie);
				logSer.loginSuccess(cmd.getEmail(), sessionId, cmd.getLoginOption());
			} else {
				logSer.loginSuccess(cmd.getEmail(), null, null);
			}
		}
		return "user/main/main";
	}

	@RequestMapping(value = "/logout.do")
	public String logoutSubmit(HttpSession session) throws Exception {
		session.removeAttribute("loginInside");
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
