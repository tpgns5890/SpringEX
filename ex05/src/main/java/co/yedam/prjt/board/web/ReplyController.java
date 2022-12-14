package co.yedam.prjt.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;

@RestController	//Controller + ResponseBody
public class ReplyController {
	@Autowired ReplyService replyService;

	//전체조회
	@GetMapping("/replys/{bno}")
	public @ResponseBody List<ReplyVO> List(@PathVariable Long bno){
		return replyService.getList(bno);
	}
	//단건조회
	@GetMapping("/reply/{rno}")
	public ReplyVO reply(ReplyVO vo, @PathVariable Long rno) {
		vo.setRno(rno);
		return replyService.get(rno);
	}
		
	//등록
	@PostMapping("/replys")
	public ReplyVO insert(ReplyVO vo) {
		Long rno = vo.getRno();
		replyService.register(vo);
		ReplyVO result = replyService.get(rno);
		return result;
	}
	
	//수정
	@PutMapping("/replys")
	public ReplyVO update(@RequestBody ReplyVO vo) {
		Long rno = vo.getRno();
		replyService.modify(vo);
		ReplyVO result = replyService.get(rno);
		return result;
	}
	
	//삭제
	@DeleteMapping("/replys/{rno}")
	public ReplyVO delete(ReplyVO vo, @PathVariable Long rno) {
		vo.setRno(rno);
		replyService.remove(rno);
		return vo;
	}
}
