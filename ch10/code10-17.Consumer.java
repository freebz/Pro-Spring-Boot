// 코드 10-17 com.apress.spring.redis.Consumer 클래스

package com.apress.spring.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Component
public class Consumer {
  private static final Logger log = LoggerFactory.getLogger(Consumer.class);

  public void messageHandler(String message) {
    log.info("소비기> " + message);
  }
}
