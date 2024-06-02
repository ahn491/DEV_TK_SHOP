package com.oitct.Tkshop.controller;

import java.util.Locale;

import javax.rmi.CORBA.Util;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.oitct.Tkshop.Util.ManConstant;

@Controller
@RequestMapping("member") //맴버공통경로
public class MemberController {

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
}
