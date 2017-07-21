// 코드 12-3 com.apress.spring.config.SecurityConfiguration 클래스

package com.apress.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .antMatchers("/**").authenticated()
      .and()
      .formLogin().loginPage("/login").permitAll()
      .and()
      .logout().permitAll()
      .and()
      .csrf().disable();
  }

  @Configuration
  static protected class LoginController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/login").setViewName("login");
    }
  }
}
