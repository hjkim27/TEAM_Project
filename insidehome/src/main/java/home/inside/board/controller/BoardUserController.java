package home.inside.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import home.inside.board.service.IBoardService;

@Controller
public class BoardUserController {
	@Autowired
	private IBoardService ser;
	// 게시글 상세페이지 요청
	// 게시글 추천요청
	// 게시글 목록/검색 요청
	// 댓글등록 요청
	// 댓글수정 요청
	// 댓글삭제 요처
}
