package ex04;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.log4j.Log4j;


@Data
@Log4j
@Component //<bean id="">
public class AppleSpeaker implements Speaker{

	@Override
	public void volumeup() {
		log.info("Apple volume up");
	}
}
