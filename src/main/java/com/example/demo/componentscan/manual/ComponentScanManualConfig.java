package com.example.demo.componentscan.manual;

import com.example.demo.api.SomeInterface;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanManualConfig implements SomeInterface {

  public ComponentScanManualConfig() {
    System.out.println(this.getClass().getName());
  }
}
