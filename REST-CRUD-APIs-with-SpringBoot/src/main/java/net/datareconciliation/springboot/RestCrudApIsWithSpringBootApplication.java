package net.datareconciliation.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.datareconciliation.springboot.repository")
public class RestCrudApIsWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCrudApIsWithSpringBootApplication.class, args);
	}

}
