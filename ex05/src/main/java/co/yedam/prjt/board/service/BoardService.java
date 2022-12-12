package co.yedam.prjt.board.service;

import java.util.List;

import co.yedam.prjt.common.Paging;

public interface BoardService {
	//전체조회
	List<BoardVO> getBoardAll(BoardVO vo, Paging paging);
	
	//단건조회
    BoardVO getBoard(int bno);

}
