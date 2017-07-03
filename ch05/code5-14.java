// 코드 5-14 CommandLineRunner 인터페이스를 구현한 스프링 부트 코드

package com.apress.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication implements CommandLineRunner {

  public void run(String... args) {
    // SpringApplication.run(..) 직후에 실행됨
    // 뭔가 수행하겠지?
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(MyApplication.class, args);
  }
}
