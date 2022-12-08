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
	
	//@Test
	public void getBoardAll() {
		BoardVO vo = new BoardVO();
		//vo.setTitle("1");
		//vo.setWriter("user01");
		List<BoardVO> list = mapper.getBoardAll(vo);
		if(list != null)
			list.forEach(board -> System.out.println(board.getContent()));
	}
	
	//@Test
	public void count() {
		BoardVO vo = new BoardVO();
		int r = mapper.count(vo);
		if(r != 0)
			System.out.println(r);
	}
	
	//@Test
	public void getBoard() {
		BoardVO vo = mapper.getBoard(1);
		System.out.println(vo);
	}
	
	//@Test
	public void insertBoard() {
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트7");
		vo.setContent("테스트내용7");
		vo.setWriter("user07");
		
		int result = mapper.insertBoard(vo);
		System.out.println(result + "건 입력됨");
	}
	
	//@Test
	public void updateBoard() {
		BoardVO vo = new BoardVO();
		vo.setBno(7);
		vo.setTitle("테스트 제목7");
		vo.setContent("테스트내용07");
		
		int result = mapper.updateBoard(vo);
		System.out.println(result + "건 수정됨");
	}
	
	@Test
	public void deleteBoard() {
		BoardVO vo = new BoardVO();
		vo.setBno(7);
		int result = mapper.deleteBoard(vo);
		System.out.println(result + "건 삭제됨");
	}
}
