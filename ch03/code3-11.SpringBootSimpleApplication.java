// 코드 3-11 com.apress.spring.SpringBootSimpleApplication 클래스 버전3

package com.apress.spring;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringBootSimpleApplication {
  
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
    app.setBanner(new Banner() {
	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
	  out.print("\n\n\t나만의 멋진 배너랍니다!\n\n".toUpperCase());
	}
      });
    
    app.run(args);
  }
}
