package com.example.demo.config;

import com.example.demo.api.SomeInterface;
import com.example.demo.impl.ManualConfigBeanAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example.demo.componentscan.manual")
@Import(ManualConfigImport.class)
public class ManualConfig {

  @Bean
  SomeInterface manualConfig() {
    return new ManualConfigBeanAnnotation();
  }
}
