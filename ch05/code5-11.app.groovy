// 코드 5-11 app.groovy

@RestController
class WebApp {

    @RequestMapping("/showMessage.html")
    String greetings() {
	"스프링 부트 MVC는 쉬워요"
    }
}
