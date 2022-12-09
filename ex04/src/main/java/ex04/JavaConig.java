package ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConig {

	@Bean
	@Scope("singleton")
	//@Lazy
	public BoardService boardService() {
		return new BoardServiceImpl();
	}
}
