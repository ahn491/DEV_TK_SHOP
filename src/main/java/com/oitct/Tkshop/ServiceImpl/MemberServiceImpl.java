package com.oitct.Tkshop.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oitct.Tkshop.DAO.MemberDAO;
import com.oitct.Tkshop.VO.LoginVO;
import com.oitct.Tkshop.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO memberdao;
	
	public String getMember(LoginVO vo) {
		
		memberdao.memberRD(vo);
		
		return "";
	}
}
