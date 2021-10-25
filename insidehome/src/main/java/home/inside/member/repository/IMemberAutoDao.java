package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import home.inside.member.vo.MemberAutoVo;

public interface IMemberAutoDao {
	// 회원정보 입력(회원가입: 입력받는거아님)
	public void insert(String nickname) throws Exception;

	// 회원 탈퇴(닉네임, 수정일자만 남기고 지우기)
	public void deleteInfo(String nickname) throws Exception;

	// 회원정보 수정(개인정보수정: moddate)
	// 회원정보 수정(자동로그인: sessionid, 로그인시:마지막접속시간)
	public void update(MemberAutoVo vo) throws Exception;

	// 신고횟수+
	public void updateWarning(String nickname) throws Exception;

	// 포인트 변경(닉네임, 변동금액(set point=point+변동액))
	public void updatePoint(HashMap<String, Object> hsm) throws Exception;
	
	// 회원개인정보 조회(포인트, 경고횟수)
	public MemberAutoVo selectOne(String nickname) throws Exception;
	
	// 회원전체목록 조회(관리자)
	public List<MemberAutoVo> selectAll(String type) throws Exception;

	// 자동로그인 확인(닉네임)
	public String selectSessionId(String nickname) throws Exception;

}
