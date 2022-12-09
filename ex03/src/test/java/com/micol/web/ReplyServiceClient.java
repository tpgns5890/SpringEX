package com.micol.web;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.reply.mapper.ReplyMapper;
import com.micol.web.reply.service.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyServiceClient {
	private Long[] bnoArr = {1L,2L,3L,4L,5L};
	
	@Setter(onMethod_ = @Autowired)
	ReplyMapper mapper;
	
	//@Test
	public void testCreate() {
		IntStream.rangeClosed(1,10).forEach(i ->{
			
			ReplyVO vo = new ReplyVO();
			
			//게시물의 번호
			vo.setBno(bnoArr[i%5]);
			vo.setReply("댓글테스트 " + i);
			vo.setReplyer("replyer " + i);
			
			mapper.insert(vo);
		});
	}
	
	//@Test
	public void testMapper() {
		log.info(mapper);
	}
	
	//@Test
	public void testRead() {
		Long targetRno = 5L;
		ReplyVO vo = mapper.read(targetRno);
		log.info(vo);
	}
	
	//@Test
	public void testDelete() {
		Long targetRno = 2L;
		mapper.delete(targetRno);
	}
	
	//@Test
	public void testUpdate() {
		Long targetRno = 10L;
		ReplyVO vo = mapper.read(targetRno);
		vo.setReply("Update Reply ");
		int count = mapper.update(vo);
		log.info("update count: " + count);
	}
	
	@Test
	public void testList() {
		List<ReplyVO> replies = mapper.getList(bnoArr[0]);
		replies.forEach(reply -> log.info(reply));
	}
}
