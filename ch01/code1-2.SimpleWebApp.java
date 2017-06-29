// 코드 1-2 com.apress.spring.SimpleWebApp 클래스

package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebApp {

  public static void main(String[] args) {
    SpringApplication.run(SimpleWebApp.class, args);
  }
}
