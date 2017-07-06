// 코드 9-9 com.apress.spring.config 클래스 버전 3

package com.apress.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ResourceSecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .antMatchers("/").permitAll()
      .antMatchers("/api/**").authenticated()
      .and()
      .formLogin().loginPage("/login").permitAll()
      .and()
      .logout().permitAll();
  }

}
