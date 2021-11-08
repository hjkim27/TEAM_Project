package home.inside.supporter.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import home.inside.supporter.service.IQuestionService;
import home.inside.supporter.vo.QuestionVo;

@Controller
@RequestMapping("/manager")
public class QuestionMgrController {
	@Autowired
	public IQuestionService ser;

	// QA등록폼 요청
	@RequestMapping("/qa/insertForm.do")
	public String insertQaForm(Model model) throws Exception {
		model.addAttribute("question", new QuestionVo());
		return "/manager/supporter/qaInsertForm";
	}

	// QA등록요청
	@RequestMapping(value="/qa/insert.do", method = RequestMethod.POST)
	public String insertQaSubmit(String askType, String title, String content, HttpSession session) throws Exception {
		String nickname = (String) session.getAttribute("mgrInside");
		if(askType==null || title==null || content==null) {
			return "/manager/question/qaInsertForm";
		}
		ser.insertQuestion(askType, nickname, title, content);
		return "redirect:/manager/qa/list.do";
	}

	// QA수정폼 요청
	@RequestMapping("/qa/updateForm.do")
	public String updateQaForm(@RequestParam(value = "num") int num, Model model) throws Exception {
		model.addAttribute("qa", ser.selectQuestion(num));
		return "/manager/supporter/qaUpdateForm";
	}

	// QA수정요청
	@RequestMapping(value="/qa/update.do")
	public String updateQaSubmit(String title, String content, int num) throws Exception {
		if(num==0 || title==null || content==null) {
			return "/manager/question/insertForm";
		}
		return "redirect:/manager/qa/list.do";
	}

	// QA삭제요청
	@RequestMapping(value="/qa/delete.do")
	public String deleteQaSubmit(int num) throws Exception {
		ser.deleteQuestion(num);
		return "redirect:/manager/qa/list.do";
	}

	// QA목록조회 요청
	@RequestMapping("/qa/list.do")
	public String selectQaList(Model model) throws Exception {
		List<HashMap<String, Object>> tmp = ser.questionList();
		model.addAttribute("qa", tmp);
		return "/manager/supporter/qaList";
	}

	// ASK목록
	@RequestMapping("/ask/list.do")
	public String AskList(String type, Model model) throws Exception {
		model.addAttribute("qa", ser.selectAskList(type));
		return "/manager/supporter/askList";
	}

	// 문의 답변 폼 요청
	@RequestMapping("/ask/answerForm.do")
	public String updateAskForm(int num, Model model) throws Exception {
		model.addAttribute("qa", ser.selectAskDetail(num));
		return "/manager/supporter/answerForm";
	}

	// 관리자 문의 답변 요청
	@RequestMapping(value="/ask/answer.do", method = RequestMethod.POST)
	public String updateAskSubmit(String answer, int num) throws Exception {
		if(answer!=null && !answer.trim().isEmpty()) {
			ser.updateAsk(answer, num);
		}
		return "redirect:/manager/ask/list.do";
	}

}
