package home.inside.member.service;

import java.util.List;

import home.inside.member.util.RegistCommand;
import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberDropVo;

public interface IRegistService {
	//회원가입 처리
	public void registMember(RegistCommand regCmd, String gender, Integer storedate, MemberAddrVo addrVo) throws Exception;
	//회원가입 중복체크(이메일, 닉네임)
	public List<String> overlapCheck(String type, String str) throws Exception;
}
