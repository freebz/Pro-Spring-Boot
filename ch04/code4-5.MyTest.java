// 코드 4-5 MyTest 클래스

import org.junit.Rule;
import org.junit.Text;
import org.springframework.boot.test.OutputCapture;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class MyTest {

  @Rule
  public OutputCapture capture = new OutputCapture();

  @Test
  public void stirngTest() throws Exception {
    System.out.println("자바에서 스프링 부트 테스트!");
    assertThat(capture.toString(), containsString("자바에서 스프링 부트 테스트!"));
  }

}
