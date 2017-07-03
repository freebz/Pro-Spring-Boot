// 코드 3-12 com.apress.spring.SpringBootSimpleApplication 클래스 버전4

package com.apress.spring;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleApplication {
  
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
    app.setBanneMode(Mode.OFF);
    app.run(args);
  }
}
