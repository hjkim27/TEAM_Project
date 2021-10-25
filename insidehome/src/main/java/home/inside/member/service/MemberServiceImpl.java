package home.inside.member.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.inside.member.repository.IMemberAddrDao;
import home.inside.member.repository.IMemberAutoDao;
import home.inside.member.repository.IMemberDao;
import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberAutoVo;
import home.inside.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements IMemberService {
	@Autowired
	private IMemberDao dao;
	@Autowired
	private IMemberAutoDao autoDao;
	@Autowired
	private IMemberAddrDao addrDao;
	
	@Override
	public HashMap<String, Object> selectInfo(String nickname) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("memberVo", dao.selectOne(nickname));
		result.put("memberAutoVo", autoDao.selectOne(nickname));
		result.put("memberAddrVo", addrDao.selectOne(nickname));
		return result;
	}

	@Override
	public void updateInfo(MemberVo vo,MemberAutoVo autoVo,  MemberAddrVo addrVo) throws Exception {
		dao.updateInfo(vo);
		autoDao.update(autoVo);
		addrDao.updateInfo(addrVo);
	}

	@Override
	public HashMap<String, Object> selectAllMember(String type) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("member", dao.selectAll(type));
		result.put("auto", autoDao.selectAll(type));
		return result;
	}

	@Override
	public String findInfo(String type, String email, String phone1, String phone2) throws Exception {
		HashMap<String, Object> hsm = new HashMap<String, Object>();
		hsm.put("type", type);
		hsm.put("email", email);
		hsm.put("phone1", phone1);
		hsm.put("phone2", phone2);
		return dao.findEmail(hsm);
	}

	@Override
	public void updateWarning(String nickname) throws Exception {
		autoDao.updateWarning(nickname);
	}

	@Override
	public void updatePoint(String nickname, int point) throws Exception {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("nickname", nickname);
		hm.put("point", point);
		autoDao.updatePoint(hm);
	}

	@Override
	public void upatePassword(String nickname, String password, String newPassword) throws Exception {
		HashMap<String, Object> hsm = new HashMap<String, Object>();
		hsm.put("nickname", nickname);
		hsm.put("password", password);
		hsm.put("newPassword", newPassword);
		dao.updatePw(hsm);
	}

}
