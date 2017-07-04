// 코드 6-2 com.apress.spring.SpringBootApplicationTests 클래스

package com.apress.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootApplication.class)
public class SpringBootApplicationTests {
  
  @Test
  public void contextLoads() {
  }

}
