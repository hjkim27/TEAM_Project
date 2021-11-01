package home.inside.member.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.inside.board.vo.BoardVo;
import home.inside.common.service.IPointService;
import home.inside.member.service.IMemberInfoService;

@Controller
@RequestMapping("/user/mypage")
public class MemberInfoController {
	@Autowired
	private IMemberInfoService infoSer;
	@Autowired
	private IPointService pointSer;
	// private IBoardService boardSer;
	// private IQuestionService qaSer;
	
	@RequestMapping(value = "/main.do")
	public String mypage(Model model, HttpSession session) throws Exception {
		String nickname = (String)session.getAttribute("loginInside");
		model.addAttribute("infoCount", infoSer.selectMyCount(nickname));
		model.addAttribute("boardList", new ArrayList<BoardVo>());
		model.addAttribute("qaCount", 3);
		return "user/member/mypage/mypageMain";
	}

	@RequestMapping(value = "/info/view.do")
	public String myInfo(Model model, HttpSession session) throws Exception {
		String nickname = (String)session.getAttribute("loginInside");
		model.addAttribute("myInfo", infoSer.selectInfo(nickname));
		return "user/member/mypage/memberInfo";
	}

	@RequestMapping(value = "/info/updateForm.do", method = RequestMethod.POST)
	public String infoUpdateForm(Model model, HttpSession session) throws Exception {
		String nickname = (String)session.getAttribute("loginInside");
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
