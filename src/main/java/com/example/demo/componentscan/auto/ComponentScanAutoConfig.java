package com.example.demo.componentscan.auto;

import com.example.demo.api.SomeInterface;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanAutoConfig implements SomeInterface {

  public ComponentScanAutoConfig() {
    System.out.println(this.getClass().getName());
  }
}
