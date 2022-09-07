package com.example.demo.config;

import com.example.demo.api.SomeInterface;
import com.example.demo.impl.AutoConfigImportBeanAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.componentscan.autoimport")
public class AutoConfigImport {

  @Bean
  SomeInterface autoConfigImport() {
    return new AutoConfigImportBeanAnnotation();
  }
}
