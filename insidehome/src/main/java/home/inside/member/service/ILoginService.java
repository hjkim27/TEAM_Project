package home.inside.member.service;

public interface ILoginService {
	// 로그인 시 회원정보 확인용(member): 결과가 1이면 성공
	public int loginCheck(String email, String password) throws Exception;
	
	// 로그인 완료(auto)
	public void loginSuccess(String nickname, String sessionId) throws Exception;
}
