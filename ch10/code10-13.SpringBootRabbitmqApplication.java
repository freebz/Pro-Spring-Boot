// 코드 10-13 com.apress.spring.SpringBootRabbitmqApplication 클래스

package com.apress.spring;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.apress.spring.rabbitmq.Producer;

@SpringBootApplication
public class SpringBootRabbitmqApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootRabbitmqApplication.class, args);
  }

  @Value("${myqueue}")
  String queue;

  @Bean
  Queue queue() {
    return new Queue(queue, false);
  }

  @Bean
  CommandLineRunner sender(Producer producer) {
    return args -> {
      producer.sendTo(queue, "안녕하세요, 여러분!");
    };
  }
}
