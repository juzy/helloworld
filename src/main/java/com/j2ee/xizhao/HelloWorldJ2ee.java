package com.j2ee.xizhao;

import com.sun.net.httpserver.HttpsServer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>
 * <p> Date: 13-5-13 Time: 下午3:51 </p>
 *
 * @author xizhao.xsz
 */
public class HelloWorldJ2ee extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
               PrintWriter out = response.getWriter();
               out.println("<html>");
               out.println("<head>");
               out.println("<title>Hello World!</title>");
               out.println("</head>");
               out.println("<body>");
               out.println("<h1>Hello World!</h1>");
               out.println("</body>");
               out.println("</html>");
    }
}
