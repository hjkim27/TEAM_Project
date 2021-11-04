package home.inside.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import home.inside.board.service.IBoardService;

@Controller
public class BoardArticleController {
	@Autowired
	private IBoardService ser;
	
	// 회원 글 작성 폼 요청
	public String registArticleForm() throws Exception{
		return null;
	}
	// 회원 글 작성 요청
	public String registArticleSubmit() throws Exception{
		return null;
	}
	
	
	// 회원 글 수정 폼 요청
	public String updateArticleForm() throws Exception{
		return null;
	}
	// 회원 글 수정 요청
	public String updateArticleSubmit() throws Exception{
		return null;
	}
	
	
	// 회원 글 삭제요청
	public String deleteArticleSubmit() throws Exception{
		return null;
	}
}
