// 코드 12-2 com.apress.spring.config.InMemorySecurityConfiguration 클래스

package com.apress.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@Configuration
@EnableGlobalAuthentication
public class InMemorySecurityConfiguration {

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("spring").password("boot").roles("USER").and().withUser("admin").password("password").roles("USER", "ADMIN");
  }
}
