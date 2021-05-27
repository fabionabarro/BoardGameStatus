package com.eventos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardgameApplication {

	static Logger LOGGER = LoggerFactory.getLogger(BoardgameApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BoardgameApplication.class, args);
		LOGGER.info("Application Started");
	}
}
