// 코드 10-19 com.apress.spring.SpringBootRedisApplication 클래스

package com.apress.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.apress.spring.redis.Producer;

@SpringBootApplication
public class SpringBootRedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootRedisApplication.class, args);
  }

  @Value("${topic}")
  String topic;

  @Bean
  CommandLineRunner sendMessage(Producer producer) {
    return args -> {
      producer.sendTo(topic, "스프링 부트와 레디스 메시징 시작!");
    };
  }
}
