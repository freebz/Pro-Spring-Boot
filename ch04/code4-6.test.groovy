// 코드 4-6 test.groovy

class SimpleWebTest {

    @Test
    void greetingsTest() {
	assertEquals("스프링 부트 시작!", new WebApp().greetings())
    }
}
