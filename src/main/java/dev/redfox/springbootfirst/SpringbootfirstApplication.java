package dev.redfox.springbootfirst;

import dev.redfox.springbootfirst.student.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class SpringbootfirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfirstApplication.class, args);
	}


}
