package vn.spring.api.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class SpringDataApiCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApiCourseApplication.class, args);
	}

}
