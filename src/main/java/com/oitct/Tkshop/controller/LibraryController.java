package com.oitct.Tkshop.controller;

import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oitct.Tkshop.Util.ManConstant;
import com.oitct.Tkshop.VO.BookInsertVO;
import com.oitct.Tkshop.service.LibraryService;

@Controller
@RequestMapping("library") //도서관
public class LibraryController {
	
	@Autowired
	LibraryService libraryservice;
	
	/**
	 * 도서관 메인페이지 이동
	 * 
	 * @param null 도서관 메인페이지 이동
	 * @return 
	 */
	@RequestMapping(value = "/library_main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		ManConstant.logger.info("...너를 믿을수밖에. 루테란");
		
		return "/library/library_main";
	}
	
	/**
	 * 도서등록페이지로
	 * 
	 * @param null 도서등록페이지로
	 * @return 
	 */
	@RequestMapping(value = "/move_insert", method = RequestMethod.GET)
	public String move_insert(Locale locale, Model model) {
		
		ManConstant.logger.info("도서등록페이지로 이동");
		
		return "/library/library_insert";
	}
	
	/**
	 * 도서등록
	 * 
	 * @param BookInsertVo 도서등록페이지로
	 * @return 
	 */
	@RequestMapping(value = "/book_insert", method = RequestMethod.POST)
	@ResponseBody //ajax를 쓰기위한 필수 선언부
	public HashMap<String, Object> book_insert(HttpServletRequest request, HttpServletResponse response) {
		
		BookInsertVO srch_cnd = new BookInsertVO();
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		int unitPrice = Integer.parseInt(request.getParameter("unitPrice"));
		
		srch_cnd.setBookid(request.getParameter("bookId")); //도서코드
		srch_cnd.setBookname(request.getParameter("bookname")); //도서명
		srch_cnd.setUnitprice(unitPrice); //가격
		srch_cnd.setAuthor(request.getParameter("author")); //저자
		srch_cnd.setPublisher(request.getParameter("publisher")); //출판사
		srch_cnd.setReleasedate(request.getParameter("releaseDate")); //출판일
		srch_cnd.setTotalpages(request.getParameter("totalPages")); //총페이지수
		srch_cnd.setDescription(request.getParameter("description")); //상세정보
		srch_cnd.setCategory(request.getParameter("category")); //분류
		srch_cnd.setUnitsinstock(request.getParameter("unitsInStock")); //재고수
		srch_cnd.setSituation(request.getParameter("situation")); //상태
		
		/*
		 * @Developer 이웅주
		 * INSERT, UPDATE, DELETE 는 resultType이 자동으로 int값이다
		 * 해서 Service + ServiceImpl 단에 public int로 지정해주어야하며
		 * 해당의 결과가 1일경우 정상 그렇지않은경우 1이외의 값을 지정하여 JSP로 돌려보낸다
		 * ajax통신의 경우 dataType을 JSON으로 지정하지 않으면 key value 값을 찾지못하기때문에
		 * 반드시  dataType을 JSON으로 지정하고 해당의 컨트롤러에 @ResponseBody를 선언한다.
		 */
		
		if(libraryservice.bookinsert(srch_cnd) == 1) { //Service단의 결과가 1은 정상
			
			ManConstant.logger.info("DB_INSERT 정상");
			
			map.put("result", 1); //화면에 result라는 key값에 1을 셋팅하여 JSON 형싱으로 return 한다
			
		} else {
			
			ManConstant.logger.info("DB_INSERT ERROR");
			
			map.put("result", 0); //해당의 로직은 입력실패 화면에 result라는 key값에 0을 셋팅하여 JSON 형싱으로 return 한다 
		}
		
		return map;
		
	}
	
	/**
	 * 도서조회 페이지로
	 * 
	 * @param 도서조회 페이지로
	 * @return 
	 */
	@RequestMapping(value = "/move_select", method = RequestMethod.GET)
	public String move_select(Locale locale, Model model) {
		
		ManConstant.logger.info("도서조회 페이지로 이동");
		
		return "/library/library_select";
	}
	
	/**
	 * 도서조회 페이지로
	 * 
	 * @param 도서조회 페이지로
	 * @return 
	 */
	@RequestMapping(value = "/library_select", method = RequestMethod.POST)
	@ResponseBody //ajax를 쓰기위한 필수 선언부
	public String library_select(Locale locale, Model model) {
		
		ManConstant.logger.info("도서조회  controller");
		
		//libraryservice
		return "/library/library_select";
	}
	
}
