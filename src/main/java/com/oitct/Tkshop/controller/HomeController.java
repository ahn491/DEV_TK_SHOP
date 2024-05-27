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
	public String home(Locale locale, Model model) {

		ManConstant.logger.info("나는 경호실의 탱크왕 안성훈이다");
		ManConstant.logger.info("내 말에 토를 달면 용기병으로 만들어버릴것이다");
		ManConstant.logger.info("도시를 불태우고 서를 집어삼키면우리에게서 새로운 세계가 탄생할 것이다", locale);

		return "/home/home";
	}

}
