package home.inside.member.controller;

import org.springframework.validation.Errors;

import home.inside.common.service.IPointService;
import home.inside.member.service.IMemberService;
import home.inside.member.utils.DropMemberCommand;

public class DropMemberController {
/*
- boardService: IBoardPostService
- questionService: IQuestionService
- goodsService: IGoodsService
- warningService: IWarningService
- talkService: ITalkService
 */
	private IMemberService memberService;
	private IPointService pointService;
	
	// 회원 탈퇴페이지 요청
	public String dropMemberForm() {
		return null;
	}
	
	// 회원 탈퇴 처리
	public String dropMemberSubmit(DropMemberCommand cmd, Errors errors) {
		return null;
	}
	
	// 회원 제적 처리
	public String blackMemberSubmit(String nickname) {
		return null;
	}
}
