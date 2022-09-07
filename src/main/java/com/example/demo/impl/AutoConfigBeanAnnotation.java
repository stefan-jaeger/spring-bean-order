package com.example.demo.impl;

import com.example.demo.api.SomeInterface;

public class AutoConfigBeanAnnotation implements SomeInterface {
  public AutoConfigBeanAnnotation() {
    System.out.println(this.getClass().getName());
  }
}
