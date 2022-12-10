package com.micol.web.board.service;

import java.util.List;

import com.micol.web.common.Paging;

public interface BoardService {
	//전체조회
	List<BoardVO> getBoardAll(BoardVO vo, Paging paging);
	
	//단건조회
    BoardVO getBoard(int bno);

}
