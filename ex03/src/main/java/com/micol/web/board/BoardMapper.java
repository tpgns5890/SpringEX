package com.micol.web.board;

import java.util.List;

public interface BoardMapper {
	List<BoardVO> getBoardAll(BoardVO vo);
	int count(BoardVO vo);
	BoardVO getBoard(int bno);
	int insertBoard(BoardVO vo);
	int updateBoard(BoardVO vo);
	int deleteBoard(BoardVO vo);
}
