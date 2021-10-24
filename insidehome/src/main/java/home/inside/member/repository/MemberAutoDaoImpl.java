package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import home.inside.member.vo.MemberAutoVo;

@Repository
public class MemberAutoDaoImpl implements IMemberAutoDao {
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(MemberAutoVo autoVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInfo(String nickname) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInfo() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLogin(String nickname, String sessionId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberAutoVo selectOne(String nickname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberAutoVo> selectAll(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateWarning(String nickname) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePoint(HashMap<String, Object> hm) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, Object> selectSessionId(String nickname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSessionId(HashMap<String, Object> hm) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
