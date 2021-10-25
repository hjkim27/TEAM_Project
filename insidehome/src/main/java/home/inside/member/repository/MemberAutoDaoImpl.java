package home.inside.member.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.member.vo.MemberAutoVo;

@Repository
public class MemberAutoDaoImpl implements IMemberAutoDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insert(String nickname) throws Exception {
		sqlSessionTemplate.insert("insertAuto", nickname);
	}

	@Override
	public void deleteInfo(String nickname) throws Exception {
		sqlSessionTemplate.update("deleteInfo", nickname);

	}

	@Override
	public void update(MemberAutoVo vo) throws Exception {
		sqlSessionTemplate.update("updateAuto", vo);
	}

	@Override
	public void updateWarning(String nickname) throws Exception {
		sqlSessionTemplate.update("updateWarning", nickname);
	}

	@Override
	public void updatePoint(HashMap<String, Object> hsm) throws Exception {
		sqlSessionTemplate.update("updatePoint", hsm);

	}

	@Override
	public MemberAutoVo selectOne(String nickname) throws Exception {
		List<MemberAutoVo> result = sqlSessionTemplate.selectList("selectOneAuto", nickname);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public List<MemberAutoVo> selectAll(String type) throws Exception {
		return sqlSessionTemplate.selectList("selectAllAuto", type);
	}

	@Override
	public String selectSessionId(String nickname) throws Exception {
		List<String> result = sqlSessionTemplate.selectList("selectSessionId", nickname);
		return result.isEmpty() ? null : result.get(0);
	}
}
