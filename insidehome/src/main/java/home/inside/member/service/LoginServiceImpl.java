package home.inside.member.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.inside.member.repository.IMemberAutoDao;
import home.inside.member.repository.IMemberDao;

@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private IMemberDao dao;
	@Autowired
	private IMemberAutoDao autoDao;
	
	@Override
	public int loginCheck(String email, String password) throws Exception {
		return dao.selectExistInfo(email, password);
	}

	@Override
	public void loginSuccess(String nickname, String sessionId) throws Exception {
		autoDao.updateLogin(nickname, sessionId);
	}

}
