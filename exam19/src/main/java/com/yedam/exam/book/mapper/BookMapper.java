package com.yedam.exam.book.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.exam.book.service.BookVO;

public interface BookMapper {
	public int BookInsert(BookVO vo);
	public List<BookVO> getBookAll(BookVO vo);
	public List<Map<String, Object>> getRentAll();
}
