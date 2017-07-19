// 코드 10-14 com.apress.spring.SpringBootRabbitmqApplication 클래스 버전2

package com.apress.spring;

import java.util.Date;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.apress.spring.rabbitmq.Producer;

@EnableScheduling
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

  @Autowired
  Producer producer;

  @Scheduled(fixedDelay = 500L)
  public void sendMessage() {
    producer.sendTo(queue, "안녕하세요, 여러분! 지금 시각은 " + new Date());
  }
}
