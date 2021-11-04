package home.inside.board.repository;

import java.util.HashMap;
import java.util.List;

import home.inside.board.vo.BoardRefVo;

public interface IBoardRefDao {
	// 댓글 등록 > num, boardNum, writer(nickname), content
	public void insertRef(HashMap<String, Object> hsm) throws Exception;
	// 댓글 수정 > content, num
	public void updateRef(HashMap<String, Object> hsm) throws Exception;
	// 댓글 삭제
	public void deleteRef(int num) throws Exception;
	
	
	// 댓글 전체삭제
	public void deleteAllRef(int boardNum) throws Exception;
	// 댓글 목록 조회
	public List<BoardRefVo> selectListRef(int boardNum) throws Exception;	
	/* // 댓글 전체삭제(회원탈퇴)
	 * 1. 회원 닉네임에 해당하는 게시글 번호 가져와서 > 회원이 작성한 게시글 번호 조회 필요
	 * 2. 그 번호를 for문으로 돌리면서 게시글에 달린 삭제  > for문으로 댓글 삭제 진행
	 * */

}
