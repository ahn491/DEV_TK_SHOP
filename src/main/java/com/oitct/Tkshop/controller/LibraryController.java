package com.oitct.Tkshop.controller;

import java.util.Locale;

import javax.rmi.CORBA.Util;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.oitct.Tkshop.Util.ManConstant;

@Controller
@RequestMapping("library") //맴버공통경로
public class LibraryController {

	@RequestMapping(value = "/library_main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		ManConstant.logger.info("...너를 믿을수밖에. 루테란");
		
		return "/library/library_main";
	}
	
}
