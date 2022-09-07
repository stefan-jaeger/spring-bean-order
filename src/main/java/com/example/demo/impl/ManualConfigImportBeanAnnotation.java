package com.example.demo.impl;

import com.example.demo.api.SomeInterface;

public class ManualConfigImportBeanAnnotation implements SomeInterface {
  public ManualConfigImportBeanAnnotation() {
    System.out.println(this.getClass().getName());
  }
}
