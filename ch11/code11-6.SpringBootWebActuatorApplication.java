// 코드 11-6 com.apress.spring.SpringBootWebActuatorApplication 클래스

package com.apress.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apress.spring.repository.PersonRepository;

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

  private static final Logger log = LoggerFactory.getLogger(SpringBootWebActuatorApplication.class);

  @Bean
  CommandLineRunner findAll(PersonRepository repo) {
    return args -> {
      log.info("> DB에서 조회한 Person: ");
      repo.findAll().forEach(person -> log.info(person.toString()));
    };
  }
}
