package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.member.vo.MemberInfoDto;

@Repository
public class MemberMainDaoImpl implements IMemberMainDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertMainInfo(HashMap<String, Object> hsm) throws Exception {
		sqlSessionTemplate.insert("insertMainInfo", hsm);
	}

	@Override
	public List<HashMap<String, Object>> selectMainList() throws Exception {
		return sqlSessionTemplate.selectList("selectMainList");
	}

	@Override
	public List<HashMap<String, Object>> searchMainList(String nickname) throws Exception {
		return sqlSessionTemplate.selectList("searchMainList", nickname);
	}

	@Override
	public int updatePw(HashMap<String, Object> hsm) throws Exception {
		return sqlSessionTemplate.update("updatePw", hsm);
	}

	@Override
	public void deleteMainInfo(String nickname) throws Exception {
		sqlSessionTemplate.delete("deleteMainInfo", nickname);
	}

	@Override
	public HashMap<String, Object> selectLoginInfo(String email) throws Exception {
		List<HashMap<String, Object>> result = sqlSessionTemplate.selectList("selectLoginInfo", email);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public String selectIsEqualsToInsert(HashMap<String, Object> hsm) throws Exception {
		List<String> result = sqlSessionTemplate.selectList("selectIsEqualsToInsert", hsm);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public void updateLoginSuccess(HashMap<String, Object> hsm) throws Exception {
		sqlSessionTemplate.update("updateLoginSuccess", hsm);
	}

	@Override
	public int emailCheck(String email) throws Exception {
		return sqlSessionTemplate.selectOne("emailCheck", email);
	}

	@Override
	public int nicknameCheck(String nickname) throws Exception {
		return sqlSessionTemplate.selectOne("nicknameCheck", nickname);

	}

	@Override
	public String findMemberInfo(HashMap<String, Object> hsm) throws Exception {
		List<String> result = sqlSessionTemplate.selectList("findMemberInfo", hsm);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public MemberInfoDto selectInfo(String nickname) throws Exception {
		return sqlSessionTemplate.selectOne("selectInfo", nickname);
	}

}
