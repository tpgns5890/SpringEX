package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
//@Component
public class BoardServiceImpl implements BoardService {

	@Override
	public int boardInsert() {
		log.info("등록완료");
		return 0;
	}

}
