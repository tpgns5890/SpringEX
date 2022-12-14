package com.yedam.exam.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class RentVO {
	int rentNo;
	int bookNo;
	int rentPrice;
	
	@JsonFormat(pattern="yyyy/MM/dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date rentDate;
	String rentStatus;
}
