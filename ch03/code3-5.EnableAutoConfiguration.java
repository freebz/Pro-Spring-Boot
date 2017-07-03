// 코드 3-5 org.springframework.boot.autoconfigure.EnableAutoConfiguration 크래스 중에서

// ...
// 다른 선언 생략
// ..
@Import(EnableAutoConfigurationImportSelector.class)
public @interface EnableAutoConfiguration {
  
  Class<?>[] exclude() default {};

  String[] excludeName() default {};

}
