package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import home.inside.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements IMemberDao {
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(MemberVo memberVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInfo(String nickname) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInfo(MemberVo memberVo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVo selectOne(String nickname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVo> selectAll(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePw(String nickname, String password, String newPassword) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String selectCheck(HashMap<String, Object> hm) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectExistInfo(String email, String password) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findEmail(String email, String phone1, String phone2) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
