package com.formaci.nbdi.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CursoServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoServicioItemApplication.class, args);
	}

}
