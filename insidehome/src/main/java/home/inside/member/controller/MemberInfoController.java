package home.inside.member.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	// private IBoardDetailService boardSer;
	// private IGoodsService goodsSer;
	// private IQuestionService qaSer;

	@RequestMapping(value = "/main.do")
	public String mypage(String viewPage, String str, Model model, HttpSession session) throws Exception {
		viewPage = (viewPage == null) ? "board" : viewPage;
		String nickname = (String) session.getAttribute("loginInside");
		model.addAttribute("infoCount", infoSer.selectMyCount(nickname));
		model.addAttribute("articleList", new ArrayList<HashMap<String, Object>>()); 
											// boardSer.searchNickname(nickname, str)
		model.addAttribute("orderCount", 2);
											// goodsSer.nicknameOrderCount(nickname)
		model.addAttribute("qaCount", 3);
		model.addAttribute("viewPage", viewPage);
		if (viewPage.equals("point")) {
			model.addAttribute("pointList", pointSer.selectList(nickname));
		}
		if (viewPage.equals("order")) {
			model.addAttribute("orderList", new ArrayList<HashMap<String, Object>>()); 
											// goodsSer.nicknameOrderList(nickname)
		}
		return "user/member/mypage/mypageMain";
	}

	@RequestMapping(value = "/info/view.do")
	public String myInfo(Model model, HttpSession session) throws Exception {
		String nickname = (String) session.getAttribute("loginInside");
		model.addAttribute("myInfo", infoSer.selectInfo(nickname));
		return "user/member/mypage/memberInfo";
	}

	@RequestMapping(value = "/info/updateForm.do", method = RequestMethod.POST)
	public String infoUpdateForm(Model model, HttpSession session) throws Exception {
		String nickname = (String) session.getAttribute("loginInside");
		model.addAttribute("myInfo", infoSer.selectInfo(nickname));
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
