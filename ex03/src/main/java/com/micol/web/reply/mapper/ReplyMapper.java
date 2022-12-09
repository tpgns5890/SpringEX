package com.micol.web.reply.mapper;

import java.util.List;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> getRepAll(ReplyVO vo);
	int insertRep(ReplyVO vo);
}
