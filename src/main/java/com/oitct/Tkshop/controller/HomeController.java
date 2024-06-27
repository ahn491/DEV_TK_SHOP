package com.oitct.Tkshop.controller;

import java.util.Locale;

import javax.rmi.CORBA.Util;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.oitct.Tkshop.Util.ManConstant;

/* 첫 페이지 호출 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		ManConstant.logger.info("Tomcat 구동성공 프로젝트 구동가능");
		
		return "/home/login_main";
	}
	
}
