package com.oitct.Tkshop.DAO;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oitct.Tkshop.VO.BookInsertVO;

@Repository
public class LibraryDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private static final String MAPPER_NS = "sql.Library_sql";

	public int BookWD(BookInsertVO srch_cnd) throws SQLException {
		
		System.out.println(srch_cnd);
		
		sqlSession.insert(MAPPER_NS + ".LibraryWD", srch_cnd);
		
		return 1;
		
	}
}
