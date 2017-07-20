// 코드 11-2 com.apress.spring.SpringBootWebActuatorApplication 클래스

package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootWebActuatorApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootWebActuatorApplication.class, args);
  }

  @RequestMapping("/")
  public String index() {
    return "스프링 부트 액추에이터";
  }
}
