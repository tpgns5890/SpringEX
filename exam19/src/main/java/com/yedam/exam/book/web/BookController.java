package com.yedam.exam.book.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yedam.exam.book.service.BookService;
import com.yedam.exam.book.service.BookVO;

@Controller
@RequestMapping("/book")
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
	@RequestMapping("/bookList")
	public String bookList(Model model, BookVO vo){
		model.addAttribute("books", service.getBookAll(vo));
		return "book/bookListPage";
	}
	
	@GetMapping("/rent")
	public @ResponseBody List<Map<String, Object>> getRent() {	
	List<Map<String, Object>> result = service.getRentAll();
	return result;
	}
}
