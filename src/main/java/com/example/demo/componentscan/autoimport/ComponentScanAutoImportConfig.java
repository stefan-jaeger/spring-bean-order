package com.example.demo.componentscan.autoimport;

import com.example.demo.api.SomeInterface;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanAutoImportConfig implements SomeInterface {

  public ComponentScanAutoImportConfig() {
    System.out.println(this.getClass().getName());
  }
}
