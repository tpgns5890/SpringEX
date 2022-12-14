package co.yedam.prjt.board.service;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ReplyVO {
	private Long rno;
	private Long bno;
	
	private String reply;
	private String replyer;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date replyDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updateDate;
}
