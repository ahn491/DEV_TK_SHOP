package com.oitct.Tkshop.service;

import org.springframework.stereotype.Service;

import com.oitct.Tkshop.VO.LoginVO;

@Service
public interface MemberService {

	public String getMember(LoginVO vo);
}
