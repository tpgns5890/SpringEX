package com.micol.web;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.board.BoardMapper;
import com.micol.web.board.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperClient {
	@Autowired SqlSession mybatis;
	@Autowired BoardMapper mapper;
	
	@Test
	public void getBoardAll() {
		BoardVO vo = new BoardVO();
		List<BoardVO> list = mapper.getBoardAll(vo);
		if(list != null)
			list.forEach(board -> System.out.println(board.getContent()));
	}
	
}
