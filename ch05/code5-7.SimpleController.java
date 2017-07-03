// 코드 5-7 com.apress.spring.SimpleController 클래스

package com.apress.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SimpleController extends AbstractController {

  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest request,
					       HttpServletResponse response) throws Exception {

    ModelAndView model = new ModelAndView("showMessage");
    model.addObject("message", "스프링 MVC 웹 애플리케이션");

    return model;
  }
}
