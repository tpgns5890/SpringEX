package com.yedam.exam.book.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yedam.exam.book.mapper.BookMapper;
import com.yedam.exam.book.service.BookService;
import com.yedam.exam.book.service.BookVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

	private BookMapper mapper;
	
	@Override
	public int BookInsert(BookVO vo) {
		return mapper.BookInsert(vo);
	}

	@Override
	public List<BookVO> getBookAll(BookVO vo) {
		return mapper.getBookAll(vo);
	}

	@Override
	public List<Map<String, Object>> getRentAll() {
		return mapper.getRentAll();
	}

}
