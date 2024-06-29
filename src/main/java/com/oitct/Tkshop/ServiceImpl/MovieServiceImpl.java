package com.oitct.Tkshop.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oitct.Tkshop.DAO.MovieDAO;
import com.oitct.Tkshop.VO.MovieVO;
import com.oitct.Tkshop.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO moviedao;
	
	@Override
	public List<MovieVO> getMovieList() 
	{
		List<MovieVO> list = moviedao.MovieListRD();
		
		return list;
	}
	//  상세보기
	@Override
	public MovieVO findByNo(int no) {
		MovieVO movie = moviedao.MovieRD_By_No(no);
		return movie;
	}
	@Override
	public void hitsUpper(int no) {
		moviedao.hitsUpper(no);
		
	}

}
