package home.inside.member.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.inside.member.repository.IMemberAddrDao;
import home.inside.member.repository.IMemberDropDao;
import home.inside.member.repository.IMemberMainDao;
import home.inside.member.repository.IMemberSubDao;
import home.inside.member.util.RegistCommand;
import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberDropVo;

@Service
public class RegistServiceImpl implements IRegistService {
	@Autowired
	private IMemberMainDao mainDao;
	@Autowired
	private IMemberSubDao subDao;
	@Autowired
	private IMemberAddrDao addrDao;
	@Autowired
	private IMemberDropDao dropDao;
	
	@Override
	public void registMember(RegistCommand regCmd) throws Exception {
		HashMap<String , Object> mainInfo = new HashMap<String, Object>();
		mainInfo.put("Email", regCmd.getEmail());
		mainInfo.put("nickname", regCmd.getNickname());
		mainInfo.put("password", regCmd.getPassword());
		mainDao.insertMainInfo(mainInfo);
		
		HashMap<String, Object> subInfo = new HashMap<String, Object>();
		subInfo.put("nickname", regCmd.getNickname());
		subInfo.put("name", regCmd.getNickname());
		String gender = regCmd.getGender();
		gender = (gender==null)?"w":gender;
		subInfo.put("gender", gender);
		Integer storedate = regCmd.getStoredate();
		storedate = (storedate==null)?100:storedate;
		subInfo.put("storedate", storedate);
		subDao.insertSubInfo(subInfo);
		
		MemberAddrVo addrVo = new MemberAddrVo();
		addrVo.setNickname(regCmd.getNickname());
		addrVo.setAddrNum(regCmd.getAddrNum());
		addrVo.setAddr(regCmd.getAddr());
		addrVo.setAddrSub(regCmd.getAddrSub());
		addrDao.insertAddrInfo(addrVo);
	}

	@Override
	public int emailCheck(String email) throws Exception  {
		return mainDao.emailCheck(email)+dropDao.emailCheckDrop(email);
	}

	@Override
	public int nicknameCheck(String nickname) throws Exception  {
		return mainDao.nicknameCheck(nickname)+dropDao.nicknameCheckDrop(nickname);
	}

}
