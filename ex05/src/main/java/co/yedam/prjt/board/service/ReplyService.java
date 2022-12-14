package co.yedam.prjt.board.service;

import java.util.List;

public interface ReplyService {

	public int register(ReplyVO vo);
	
	public ReplyVO get(Long rno);
	
	public ReplyVO modify(ReplyVO vo);
	
	public int remove(Long rno);
	
	public List<ReplyVO> getList(Long bno);
}
