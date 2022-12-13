package co.yedam.prjt.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.yedam.prjt.board.mapper.ReplyMapper;
import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService{
	
	private ReplyMapper mapper;

	@Override
	public int register(ReplyVO vo) {
		log.info("register......" + vo);
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) {
		log.info("get......" + rno);
		return mapper.read(rno);
	}

	@Override
	public ReplyVO modify(ReplyVO vo) {
		log.info("modify......" + vo);
		return mapper.update(vo);
	}

	@Override
	public int remove(Long rno) {
		log.info("remove......" + rno);
		return mapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(Long bno) {
		log.info("get Reply List of a Board " + bno);
		return mapper.getList(bno);
	}
	

}
