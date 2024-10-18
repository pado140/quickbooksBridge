package com.pado.quickbookbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
public class QuickbookbridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickbookbridgeApplication.class, args);
	}

}
