// 코드 4-3 test.groovy

class MyTest {

    @Test
    void simple() {
	String str = "스프링 부트에서도 제이유닛 잘 돌아가네요!"
	assertEquals "스프링 부트에서도 제이유닛 잘 돌아가네요!", str
    }
}
