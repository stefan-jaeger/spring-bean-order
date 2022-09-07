package com.example.demo.impl;

import com.example.demo.api.SomeInterface;

public class ManualConfigBeanAnnotation implements SomeInterface {
  public ManualConfigBeanAnnotation() {
    System.out.println(this.getClass().getName());
  }
}
