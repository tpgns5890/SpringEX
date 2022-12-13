package co.yedam.prjt.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.yedam.prjt.board.service.ReplyVO;

public interface ReplyMapper {
	public int insert(ReplyVO vo);
	
	public ReplyVO read(Long rno); //특정 댓글 읽기
	
	public int delete(Long rno);
	
	public ReplyVO update(ReplyVO vo);
	
	public List<ReplyVO> getList(@Param("bno") Long bno);
}
