package hello;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;

public class Application {
// logger is an singleton, is it thread-safe declared as instant variable like this??
	
//	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {

		SpringApplication.run(Application.class);
	}
	

}
