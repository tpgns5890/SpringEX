package com.yedam.exam.book.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yedam.exam.book.service.BookVO;

public interface BookMapper {
	public int BookInsert(BookVO vo);
	public List<BookVO> getBookAll();
	public HashMap<String, Object> getRentAll();
}
