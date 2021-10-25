package home.inside.member.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.member.vo.MemberAddrVo;

@Repository
public class MemberAddrDaoImpl implements IMemberAddrDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(MemberAddrVo addrVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInfo(String nickname) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInfo(MemberAddrVo addrVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberAddrVo selectOne(String nickname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
