// 코드 5-13 app.groovy

@RestController
class SimpleWebApp {

    @Autowired
    String text

    @RequestMapping("/")
    String index() {
	"${text}, 여러분도 할 수 있어요!"
    }
}

beans {
    text String, "그루비 빈을 사용한 스프링 부트"
}
