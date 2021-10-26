package home.inside.common.controller;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import home.inside.common.service.IPointService;
import home.inside.common.vo.PointVo;

@Controller
@RequestMapping("/inside")
public class PointController {
	@Autowired
	private IPointService pointSer;
	
	//출석페이지 요청
	@RequestMapping(value = "/checkForm.do")
	public String checkList(String nickname, Integer month, Model model) throws Exception {
		System.out.println("month: "+month);
		if(nickname!=null) {
			month=(month==null)?0:month;
			model.addAttribute("checkList", pointSer.selectMonth(nickname));
		}else {
			model.addAttribute("checkList", Collections.emptyList());
		}
		return "user/main/checkIn";
	}
	
	//출석처리 요청
	@RequestMapping(value = "/check.do")
	public String checkIn(String nickname, HttpServletRequest req) throws Exception {
		if(nickname!=null && pointSer.selectCheck(nickname)<=0) {
			PointVo vo = new PointVo();
			vo.setNickname(nickname);
			vo.setChangePoint(300);
			vo.setChangeWhy("checkIn");
			pointSer.insertPoint(vo);
			req.setAttribute("check", "success");
		} else if(nickname==null) {
			return "user/main/main";
		}
		req.setAttribute("check", "fail");
		return "error/commonException";
	}
	
	@RequestMapping("/main.do")
	public String view() {
		return "user/main/main";
	}
}
