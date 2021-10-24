package home.inside.member.service;

import home.inside.member.vo.MemberAddrVo;
import home.inside.member.vo.MemberAutoVo;
import home.inside.member.vo.MemberVo;

public interface IRegistDropService {
	// 회원가입(member, auto, addr)
	public void registMember(MemberVo vo, MemberAutoVo autoVo, MemberAddrVo addrVo) throws Exception;
	
	// 회원가입 시 중복조회용(member)
	public String registCheck(String str, String type) throws Exception;
	
	// 회원정보 삭제용
	public void deleteInfo(String nickname) throws Exception;
}
