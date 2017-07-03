// 코드 3-3 app.groovy

import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration

@RestController
@EnableAutoConfiguration(exclude=[ActiveMQAutoConfiguration.class])
class WebApp {

    @RequestMapping("/")
    String greetings() {
	"스프링 부트 시작!"
    }
}
