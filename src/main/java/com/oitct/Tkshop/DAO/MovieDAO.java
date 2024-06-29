package com.oitct.Tkshop.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oitct.Tkshop.VO.MovieVO;

@Repository
public class MovieDAO 
{
	@Autowired
	SqlSession sqlSession;
	
	private static final String MAPPER_NS = "sql.Movie_sql";
	
	public List<MovieVO> MovieListRD() {
		
		List<MovieVO> list = sqlSession.selectList(MAPPER_NS+".movieList");
		System.out.println(list);
		
		return list;
	}

	public MovieVO MovieRD_By_No(int no) {
		MovieVO mv = sqlSession.selectOne(MAPPER_NS+".movieRDNo", no);
		return mv;
	}

	public void hitsUpper(int no) {
		sqlSession.update(MAPPER_NS+".hitsUpper",no);
		
	}
	
	
}
