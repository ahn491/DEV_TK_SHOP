package com.oitct.Tkshop.service;

import org.springframework.stereotype.Service;

import com.oitct.Tkshop.VO.BookInsertVO;

@Service
public interface LibraryService {

	public int bookinsert(BookInsertVO srch_cnd);
}
