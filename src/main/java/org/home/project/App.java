package org.home.project;

import lombok.extern.slf4j.Slf4j;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
@Slf4j
public class App implements CommandLineRunner {

	public static void main(String [] args) {
		SpringApplication.run(App.class, args);
	}

	public void run(String [] args) {
		log.info("Hello World!");
	}


}
