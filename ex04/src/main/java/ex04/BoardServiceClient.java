package ex04;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Log4j
public class BoardServiceClient {
	
	@Autowired
	BoardService service1;
	
	@Autowired
	BoardService service2;
	
	@Test
	public void insert() {
		log.info(service1==service2);
	}
}
