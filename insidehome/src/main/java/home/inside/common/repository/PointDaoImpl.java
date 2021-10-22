package home.inside.common.repository;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import home.inside.common.vo.PointVo;

@Repository
public class PointDaoImpl implements IPointDao {
	private SqlSessionTemplate sqlSessionTemplate;

	public void insert(PointVo vo) throws Exception {
		sqlSessionTemplate.insert("insert", vo);
	}

	public int selectCheck(String nickname) throws Exception {
		return sqlSessionTemplate.selectOne("selectCheck", nickname);
	}

	public PointVo selectMonth(HashMap<String, Object> hm) throws Exception {
		return sqlSessionTemplate.selectOne("selectCountMonth", hm);
	}

	public void delete(String nickname) throws Exception {
		sqlSessionTemplate.delete("delete", nickname);
	}
}
