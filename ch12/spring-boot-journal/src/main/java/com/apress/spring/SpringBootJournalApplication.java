// 코드 12-7 com.apress.spring.SpringBootJournalApplication 클래스

package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootJournalApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringBootJournalApplication.class);
  }
  
  public static void main(String[] args) {
    SpringApplication.run(SpringBootJournalApplication.class, args);
  }
}
