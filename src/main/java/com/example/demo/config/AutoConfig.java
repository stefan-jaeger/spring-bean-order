package com.example.demo.config;

import com.example.demo.api.SomeInterface;
import com.example.demo.impl.AutoConfigBeanAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example.demo.componentscan.auto")
@Import(AutoConfigImport.class)
public class AutoConfig {

  @Bean
  SomeInterface autoConfig() {
    return new AutoConfigBeanAnnotation();
  }
}
