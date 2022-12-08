package com.micol.web.board;

import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	int bno;
	String title;
	String content;
	String writer;
	String regDate;
	String updateDate;
	
	List<String> writers;
}
