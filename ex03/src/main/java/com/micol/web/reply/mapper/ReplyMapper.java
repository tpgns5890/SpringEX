package com.micol.web.reply.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	public int insert(ReplyVO vo);
	
	public ReplyVO read(Long rno); //특정 댓글 읽기
	
	public int delete(Long rno);
	
	public int update(ReplyVO reply);
	
	public List<ReplyVO> getList(@Param("bno") Long bno);
}
