package mz.painting.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "mz.painting.com")
//@EntityScan(basePackages = "mz.painting.com")
public class
Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

}
