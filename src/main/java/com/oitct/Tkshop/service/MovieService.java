package com.oitct.Tkshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oitct.Tkshop.VO.MovieVO;
@Service
public interface MovieService {
	
	List<MovieVO> getMovieList();

	MovieVO findByNo(int no);

	void hitsUpper(int no);

}
