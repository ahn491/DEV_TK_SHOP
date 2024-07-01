package com.oitct.Tkshop.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.oitct.Tkshop.Util.ManConstant;
import com.oitct.Tkshop.VO.MovieVO;
import com.oitct.Tkshop.service.MovieService;

@Controller
@RequestMapping(value = "movie" , method=RequestMethod.GET) //맴버공통경로
public class MovieController {

	@Autowired
	MovieService ms;
	
	
	@RequestMapping(value = "/movie_main.do")
	public String main(Locale locale, Model model, ModelAndView mav) 
	{
		
		ManConstant.logger.info("영화페이지 이동");
		
		
		List<MovieVO> list = ms.getMovieList();
		
		model.addAttribute("list", list);
		
		return "/movie/movie_main";
	}
	@RequestMapping(value = "/movie_detail.do")
	public String detail(Locale locale, Model model, ModelAndView mav,@RequestParam int no) 
	{
		
		ManConstant.logger.info("영화상세페이지 이동");
		
		// 조회수올리는 메서드
		ms.hitsUpper(no);
		
		MovieVO mv = ms.findByNo(no);
		
		model.addAttribute("mv", mv);
		
		return "/moive/movie_detail";
	}
	
}
