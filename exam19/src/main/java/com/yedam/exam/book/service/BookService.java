package com.yedam.exam.book.service;

import java.util.HashMap;
import java.util.List;

public interface BookService {
	//등록
	public int BookInsert(BookVO vo);
	
	//전체조회
	public List<BookVO> getBookAll();
	
	public HashMap<String, Object> getRentAll();
}
