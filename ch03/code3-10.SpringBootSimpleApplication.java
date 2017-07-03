// 코드 3-10 com.apress.spring.SpringBootSimpleApplication 클래스 버전2

package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleApplication {
  
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
    // 더 많은 기능은 여기에 추가
    app.run(args);
  }
}
