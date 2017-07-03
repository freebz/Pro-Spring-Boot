// 코드 4-1 app.groovy

@RestController
class WebApp {

    @RequestMapping("/")
    String greetings() {
	"스프링 부트 시작!"
    }
}
