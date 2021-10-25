package home.inside.member.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.inside.member.repository.IMemberAutoDao;
import home.inside.member.repository.IMemberDao;
import home.inside.member.vo.MemberAutoVo;

@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private IMemberDao dao;
	@Autowired
	private IMemberAutoDao autoDao;
	
	@Override
	public int loginCheck(String email, String password) throws Exception {
		HashMap<String, Object> hsm = new  HashMap<String, Object>();
		hsm.put("email", email);
		hsm.put("password", password);
		return dao.selectExistInfo(hsm);
	}

	@Override
	public void loginSuccess(String nickname, String sessionId) throws Exception {
		MemberAutoVo vo = new MemberAutoVo();
		vo.setNickname(nickname);
		vo.setSessionId(sessionId);
		autoDao.update(vo);
	}

}
