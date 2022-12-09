package com.micol.web.reply.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micol.web.reply.mapper.ReplyMapper;
import com.micol.web.reply.service.ReplyService;
import com.micol.web.reply.service.ReplyVO;

@Component
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired ReplyMapper mapper;

	@Override
	public List<ReplyVO> getRepAll(ReplyVO vo) {
		
		return mapper.getRepAll(vo);
	}
	

}
