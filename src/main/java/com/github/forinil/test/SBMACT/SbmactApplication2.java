package com.github.forinil.test.SBMACT;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SbmactApplication2 {

	public static void main(String[] args) {
        logger.info("Running class {}", SbmactApplication2.class);
		SpringApplication.run(SbmactApplication2.class, args);
	}
}
