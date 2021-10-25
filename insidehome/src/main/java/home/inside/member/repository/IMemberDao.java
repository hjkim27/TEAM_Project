package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import home.inside.member.vo.MemberVo;

public interface IMemberDao {
	//회원정보 입력
	public void insert(MemberVo memberVo) throws Exception;
	
	// 회원 탈퇴(이메일, 닉네임만 남기고 지우기)
	public void deleteInfo(String nickname) throws Exception;
	
	// 개인정보 수정(성별, 유지일자)
	public void updateInfo(MemberVo memberVo) throws Exception;
	
	// 회원 비밀번호 수정 (newpassword, password, nickname) 
	public void updatePw(HashMap<String, Object> hsm) throws Exception;
	
	// 회원개인정보 조회(회원)
	public MemberVo selectOne(String nickname) throws Exception;

	// 회원전체목록 조회(관리자)
	public List<MemberVo> selectAll(String type) throws Exception;

	// 회원가입 시 중복조회(이메일, 닉네임 확인)
	public String selectCheck(HashMap<String, Object> hsm) throws Exception;

	// 로그인, 본인인증(이메일, 비밀번호)
	public int selectExistInfo(HashMap<String, Object> hsm) throws Exception;
	
	// 아이디/비밀번호찾기(아이디: 이메일 뒷부분, 번호 필요, 비밀번호: 이메일, 번호 필요)
	public String findEmail(HashMap<String, Object> hsm) throws Exception;
}
