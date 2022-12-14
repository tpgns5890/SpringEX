package com.yedam.exam.book.service;

import java.util.List;
import java.util.Map;

public interface BookService {
	//등록
	public int BookInsert(BookVO vo);
	
	//전체조회
	public List<BookVO> getBookAll(BookVO vo);
	
	public List<Map<String, Object>> getRentAll();
}
