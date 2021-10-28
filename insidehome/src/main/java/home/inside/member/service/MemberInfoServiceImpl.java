package home.inside.member.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.inside.member.repository.IMemberAddrDao;
import home.inside.member.repository.IMemberDropDao;
import home.inside.member.repository.IMemberMainDao;
import home.inside.member.repository.IMemberSubDao;
import home.inside.member.util.FindInfoCommand;
import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberDropVo;
import home.inside.member.vo.MemberInfoDto;
import home.inside.member.vo.MemberSubVo;

@Service
public class MemberInfoServiceImpl implements IMemberInfoService {
	@Autowired
	private IMemberMainDao mainDao;
	@Autowired
	private IMemberSubDao subDao;
	@Autowired
	private IMemberAddrDao addrDao;
	@Autowired
	private IMemberDropDao dropDao;

	@Override
	public MemberInfoDto selectInfo(String nickname) throws Exception {
		return mainDao.selectInfo(nickname);
	}

	@Override
	public Object selectMemberList(String type) throws Exception {
		if (type != null && type.equals("black")) {
			return dropDao.selectDropList();
		} else {
			return mainDao.selectMainList();
		}
	}

	@Override
	public Object searchMemberList(String nickname, String type) throws Exception {
		if (type != null && type.equals("black")) {
			return dropDao.searchDropList(nickname);
		} else {
			return mainDao.searchMainList(nickname);
		}
	}

	@Override
	public int updatePassword(String nickname, String pw, String newPw) throws Exception {
		HashMap<String, Object> hsm = new HashMap<String, Object>();
		hsm.put("nickname", nickname);
		hsm.put("password", pw);
		hsm.put("newPassword", newPw);
		return mainDao.updatePw(hsm);
	}

	@Override
	public HashMap<String, Object> selectMyCount(String nickname) throws Exception {
		return subDao.selectPointAndWarn(nickname);
	}

	@Override
	public void updateMyInfo(MemberSubVo subVo, MemberAddrVo addrVo) throws Exception {
		subDao.updateSubInfo(subVo);
		addrDao.updateAddrInfo(addrVo);
	}

	@Override
	public String findMemberInfo(FindInfoCommand cmd) throws Exception {
		HashMap<String, Object> hsm = new HashMap<String, Object>();
		String email = cmd.getEmail();
		if (cmd.getType().equals("email")) {
			email = email.split("@")[1];
			hsm.put("email", email);
		} else {
			hsm.put("email", email);
		}
		String phone = cmd.getPhone();
		hsm.put("phone1", phone.substring(0, 3));
		hsm.put("phone1", phone.substring(3));
		return mainDao.findMemberInfo(hsm);
	}

	@Override
	public void dropMember(MemberDropVo dropVo) throws Exception {
		dropDao.insertDropInfo(dropVo);
		String nickname = dropVo.getNickname();
		mainDao.deleteMainInfo(nickname);
		subDao.deleteSubInfo(nickname);
		addrDao.deleteAddrInfo(nickname);
	}
}
