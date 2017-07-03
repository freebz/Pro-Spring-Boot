// 코드 3-2 스프링 부트가 변경한 app.groovy

import org.springframework.web.bind.annotation.RestController;
// 다른 임포트 생략

@Grab("spring-boot-web-starter")
@EnableAutoConfiguration
@RestController
class WebApp {
    @RequestMapping("/")
    String greetings() {
	"스프링 부트 시작!"
    }

    public static void main(String[] args) {
	SpringApplication.run(WebApp.class, args);
    }
}
