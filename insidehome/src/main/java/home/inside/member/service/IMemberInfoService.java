package home.inside.member.service;

import java.util.HashMap;

import home.inside.member.util.FindInfoCommand;
import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberDropVo;
import home.inside.member.vo.MemberInfoDto;
import home.inside.member.vo.MemberSubVo;

public interface IMemberInfoService {
	//마이페이지 개인정보 조회
	public MemberInfoDto selectInfo(String nickname) throws Exception;
	//관리자페이지 회원목록 조회
	public Object selectMemberList(String type) throws Exception;
	//관리자페이지 회원목록 검색
	public Object searchMemberList(String nickname, String type) throws Exception;
	//비밀번호 변경
	public int updatePassword(String nickname, String pw, String newPw) throws Exception;
	//포인트, 경고횟수 조회
	public HashMap<String, Object> selectMyCount(String nickname) throws Exception;
	//개인정보 수정
	public void updateMyInfo(MemberSubVo subVo, MemberAddrVo addrVo) throws Exception;
	//아이디/비밀번호 찾기
	public String findMemberInfo(FindInfoCommand cmd) throws Exception;
	//회원탈퇴
	public void dropMember(MemberDropVo dropVo) throws Exception;
}
