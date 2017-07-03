// 코드 3-14 com.apress.spring.SpringBootSimpleApplication 클래스 버전10

package com.apress.spring;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootSimpleApplication {
  
  public static void main(String[] args) throws IOException {
    SpringApplication.run(SpringBootSimpleApplication.class, args);
  }
}

@Component
class MyComponent {

  private static final Logger log = LoggerFactory.getLogger(MyComponent.class);

  @Autowired
  public MyComponent(ApplicationArguments args) {
    boolean enable = args.containsOption("enable");
    if(enable)
      log.info("## > enable 옵션을 주셨네요!");

    List<String> _args = args.getNonOptionArgs();
    log.info("## > 다른 인자 ...");
    if(!_args.isEmpty())
      _args.forEach(file -> log.info(file));
  }
}
