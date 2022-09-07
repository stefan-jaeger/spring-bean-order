package com.example.demo.config;

import com.example.demo.api.SomeInterface;
import com.example.demo.impl.ManualConfigImportBeanAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.componentscan.manualimport")
public class ManualConfigImport {

  @Bean
  SomeInterface manualConfigImport() {
    return new ManualConfigImportBeanAnnotation();
  }
}
