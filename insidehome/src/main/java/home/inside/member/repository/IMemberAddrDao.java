package home.inside.member.repository;

import home.inside.member.vo.MemberAddrVo;

public interface IMemberAddrDao {
	// 회원정보 입력(회원가입)
	public void insert(MemberAddrVo addrVo) throws Exception;
	
	// 회원 탈퇴(delete가 아닌 정보삭제)
	public void deleteInfo(String nickname) throws Exception;
	
	// 회원 배송정보 수정
	public void updateInfo(MemberAddrVo addrVo) throws Exception;
	
	// 회원배송조회(포인트, 경고횟수)
	public MemberAddrVo selectOne(String nickname) throws Exception;
	
}
