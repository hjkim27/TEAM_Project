package home.inside.member.service;

import java.util.HashMap;

import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberVo;

public interface IMemberService {
	// 회원개인정보 조회(member, auto, addr)
	public HashMap<String, Object> selectInfo(String nickname) throws Exception;
	
	// 회원정보수정처리(member, auto:입력은없음, addr)
	public void updateInfo(MemberVo vo, MemberAddrVo addrVo) throws Exception;
	
	// 회원목록 조회(member, auto)
	public HashMap<String, Object> selectAllMember(String type) throws Exception;

	// 아이디/비밀번호 찾기(member)
	public String findInfo(String email, String phone1, String phone2) throws Exception;
	
	// 신고횟수+(auto)
	public void updateWarning(String nickname) throws Exception;
	
	// 포인트변동(auto)
	public void updatePoint(String nickname, int point) throws Exception;
	
	// 회원 비밀번호 수정(member)
	public void upatePassword(String nickname, String password, String newPassword) throws Exception;

	
}
