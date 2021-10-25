package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements IMemberDao {
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(MemberVo memberVo) throws Exception {
		sqlSessionTemplate.insert("insert", memberVo);
	}

	@Override
	public void deleteInfo(String nickname) throws Exception {
		sqlSessionTemplate.update("deleteInfo", nickname);
	}

	@Override
	public void updateInfo(MemberVo memberVo) throws Exception {
		sqlSessionTemplate.update("updateInfo", memberVo);
		
	}

	@Override
	public void updatePw(HashMap<String, Object> hsm) throws Exception {
		sqlSessionTemplate.update("updatePw", hsm);
	}

	@Override
	public MemberVo selectOne(String nickname) throws Exception {
		List<MemberVo> result = sqlSessionTemplate.selectList("selectOne", nickname);
		return result.isEmpty()? null:result.get(0);
	}

	@Override
	public List<MemberVo> selectAll(String type) throws Exception {
		return sqlSessionTemplate.selectList("selectAll", type);
	}

	@Override
	public String selectCheck(HashMap<String, Object> hsm) throws Exception {
		return sqlSessionTemplate.selectOne("selectCheck", hsm);
	}

	@Override
	public int selectExistInfo(HashMap<String, Object> hsm) throws Exception {
		return sqlSessionTemplate.selectOne("selectExistinfo", hsm);
	}

	@Override
	public String findEmail(HashMap<String, Object> hsm) throws Exception {
		return sqlSessionTemplate.selectOne("findEmail", hsm);
	}
}
