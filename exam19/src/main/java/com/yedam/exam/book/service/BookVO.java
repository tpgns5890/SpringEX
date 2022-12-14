package com.yedam.exam.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BookVO {
	int bookNo;
	String bookName;
	String bookCoverimg;
	
	@JsonFormat(pattern="yyyy/MM/dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date bookDate;
	
	int bookPrice;
	
	String bookPublisher;
	String bookInfo;
}
