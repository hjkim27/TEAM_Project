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
public class RegistDropServiceImpl implements IRegistDropService {
	@Autowired
	private IMemberDao dao;
	@Autowired
	private IMemberAutoDao autoDao;
	@Autowired
	private IMemberAddrDao addrDao;
	
	
	@Override
	public void registMember(MemberVo vo, MemberAddrVo addrVo) throws Exception {
		dao.insert(vo);
		autoDao.insert(vo.getNickname());
		addrDao.insert(addrVo);
	}

	@Override
	public String registCheck(String str, String type) throws Exception {
		HashMap<String, Object> hsm = new HashMap<String, Object>();
		hsm.put("type", type);
		hsm.put("str", str);
		return dao.selectCheck(hsm);
	}

	@Override
	public void deleteInfo(String nickname) throws Exception {
		dao.deleteInfo(nickname);
		autoDao.deleteInfo(nickname);
		addrDao.deleteInfo(nickname);
	}

}
