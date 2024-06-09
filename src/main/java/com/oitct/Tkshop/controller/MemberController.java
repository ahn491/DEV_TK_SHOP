package com.oitct.Tkshop.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.Locale;

import javax.rmi.CORBA.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oitct.Tkshop.Util.ManConstant;
import com.oitct.Tkshop.VO.LoginVO;
import com.oitct.Tkshop.service.MemberService;

@Controller
@RequestMapping("member") //맴버공통경로
public class MemberController {
	
	@Autowired
	MemberService memberservice;

	@RequestMapping("/main_page.do")
	public String mainpage(Locale locale, Model model) {
		
		ManConstant.logger.info("쇼핑몰 메인 페이지");
		
		return "/home/main";
	}
	
	@RequestMapping("/register.do")
	public String register(Locale locale, Model model) {
		
		ManConstant.logger.info("후후후 곤란해 보이는군?");
		
		return "/home/register";
	}
	
	@RequestMapping("/login.do")
	public String login(LoginVO vo, Model model, @RequestParam("login_id") String login_id, @RequestParam("password") String password) {
		
//		ManConstant.logger.info(vo.getLogin_id());
		
		ManConstant.logger.info(login_id);
		ManConstant.logger.info(password);
		
		vo.setLogin_id(login_id);
		vo.setPassword(password);
		
		System.out.println(vo);
		
		System.out.println(memberservice.getMember(vo));
		
		return memberservice.getMember(vo);
	}
}
