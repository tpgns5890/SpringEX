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

	//등록
	@PostMapping("/replys")
	public ReplyVO insert(ReplyVO vo) {
		replyService.register(vo);
		return vo;
	}
	
	//수정
	@PutMapping("/replys")
	public ReplyVO update(@RequestBody ReplyVO vo) {
		replyService.modify(vo);
		return vo;
	}
	
	//삭제
	@DeleteMapping("/replys/{rno}")
	public ReplyVO delete(ReplyVO vo, @PathVariable Long rno) {
		vo.setRno(rno);
		replyService.remove(rno);
		return vo;
	}
}
