// 코드 5-2 com.apress.j2ee.SimpleServlet 클래스

package com.apress.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {

  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>간단한 자바 웹 애플리케이션</h1>");
    out.println("</body>");
    out.println("</html>");
  }

}
