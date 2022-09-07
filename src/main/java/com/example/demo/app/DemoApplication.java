package com.example.demo.app;

import com.example.demo.api.SomeInterface;
import com.example.demo.config.ManualConfig;
import com.example.demo.impl.ApplicationBeanAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ManualConfig.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	SomeInterface applicationBean() {
		return new ApplicationBeanAnnotation();
	}
}
