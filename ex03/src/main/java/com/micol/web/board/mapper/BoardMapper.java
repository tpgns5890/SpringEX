package com.micol.web.board.mapper;

import java.util.List;

import com.micol.web.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> getBoardAll(BoardVO vo);
	int count(BoardVO vo);
	BoardVO getBoard(int bno);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
