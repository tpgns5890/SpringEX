package ex04;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j
@Component
public class SamsungTv implements TV {
	
	@Autowired
	Speaker speaker;
	
	//Logger log = LogManager.getLogger(SamsungTv.class);
	@Override
	public void on() {
		log.info("Samsung Tv on");
		speaker.volumeup();
	}
}