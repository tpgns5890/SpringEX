package co.yedam.prjt.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.yedam.prjt.board.service.BoardService;
import co.yedam.prjt.board.service.BoardVO;
import co.yedam.prjt.common.Paging;

@Controller //@Component
@RequestMapping("/board")
public class BoardController {
	@Autowired BoardService boardService;
	
		//전체조회
		@GetMapping("/boardSelectAll")
		public String empSelectAll(Model model, BoardVO vo, Paging paging) { //page
			paging.setPageUnit(5);
			model.addAttribute("boards", boardService.getBoardAll(vo, paging));
			return "board/boardSelect";
		}
		//단건조회
		@RequestMapping("/boardSelect")
		public String boardSelect(Model model, int bno) {
			model.addAttribute("board", boardService.getBoard(bno));
			return "board/board";
		}

}
