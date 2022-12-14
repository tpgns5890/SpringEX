package com.yedam.exam.book.web;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yedam.exam.book.service.BookService;
import com.yedam.exam.book.service.BookVO;

@RestController
public class BookController {
	@Autowired BookService service;
	
	//등록페이지 이동
	@GetMapping("/add")
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView("/book/addBookPage");
		mv.setViewName("book/addBookPage");
		return mv;
	}
	
	//등록
	@PostMapping("/books")
	public int insert(BookVO vo) {
		int result = service.BookInsert(vo);
		if(result>0) {
			return 1;
		}
		return 0;
	}
	
	//조회페이지 이동
	@GetMapping("/list")
	public ModelAndView listpage(){
		ModelAndView mv = new ModelAndView("/book/bookListPage");
		mv.setViewName("book/bookListPage");
		return mv;
	}
	
	//전체조회
	@GetMapping("/books")
	public List<BookVO> list(){
		return service.getBookAll();
	}
	
	@GetMapping("/rent")
	public @ResponseBody HashMap<String, Object> getRent() {	
	HashMap<String, Object> result = service.getRentAll();
	return result;
	}
}
