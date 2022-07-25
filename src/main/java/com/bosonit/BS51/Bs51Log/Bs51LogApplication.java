package com.bosonit.BS51.Bs51Log;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class Bs51LogApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs51LogApplication.class, args);

		log.trace("------------MENSAJE DE TRACE------------");
		log.debug("------------MENSAJE DE DEBUG------------");
		log.info("------------MENSAJE DE INFO------------");
		log.warn("------------MENSAJE DE WARN------------");
		log.error("------------MENSAJE DE ERROR------------");
	}

}
