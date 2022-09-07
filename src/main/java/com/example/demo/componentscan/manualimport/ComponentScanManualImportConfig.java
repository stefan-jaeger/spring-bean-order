package com.example.demo.componentscan.manualimport;

import com.example.demo.api.SomeInterface;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanManualImportConfig implements SomeInterface {

  public ComponentScanManualImportConfig() {
    System.out.println(this.getClass().getName());
  }
}
