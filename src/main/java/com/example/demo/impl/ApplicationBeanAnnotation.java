package com.example.demo.impl;

import com.example.demo.api.SomeInterface;

public class ApplicationBeanAnnotation implements SomeInterface {
  public ApplicationBeanAnnotation() {
    System.out.println(this.getClass().getName());
  }
}
