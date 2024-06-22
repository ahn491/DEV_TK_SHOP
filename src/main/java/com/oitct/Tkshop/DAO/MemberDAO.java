package com.oitct.Tkshop.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oitct.Tkshop.VO.LoginVO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlMap;
	
	private static final String MAPPER_NS = "sql.Member_sql";

	public int memberRD(LoginVO vo) {
		System.out.println(vo);
		
		System.out.println("a" + sqlMap.selectOne(MAPPER_NS + ".memberRD", vo));
		
		return sqlMap.selectOne(MAPPER_NS + ".memberRD", vo);
		
	}
}
