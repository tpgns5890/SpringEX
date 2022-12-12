package co.yedam.prjt.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.yedam.prjt.board.mapper.BoardMapper;
import co.yedam.prjt.board.service.BoardService;
import co.yedam.prjt.board.service.BoardVO;
import co.yedam.prjt.common.Paging;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoardAll(BoardVO vo, Paging paging) {
		paging.setTotalRecord(boardMapper.count(vo)); //start, end
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return boardMapper.getBoardAll(vo);
	}

	@Override
	public BoardVO getBoard(int bno) {
		return boardMapper.getBoard(bno);
	}

}
