// 코드 1-1 app.groovy

@RestController
class WebApp {
    @RequestMapping("/")
    String greetings() {
	"<h1>스프링 부트 시작</h1>"
    }
}
