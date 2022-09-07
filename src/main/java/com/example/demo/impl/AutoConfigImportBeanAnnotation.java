package com.example.demo.impl;

import com.example.demo.api.SomeInterface;

public class AutoConfigImportBeanAnnotation implements SomeInterface {
  public AutoConfigImportBeanAnnotation() {
    System.out.println(this.getClass().getName());
  }
}
