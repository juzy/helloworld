package com.j2ee.xizhao.servlet;

import com.sun.net.httpserver.HttpsServer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>
 * <p> Date: 13-5-13 Time: 下午3:51 </p>
 * http://www.bccn.net/Article/web/jsp/jc/200409/72_3.html
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
               out.println("<h1>Hello World!I am xizhao.xsz.中文：我是夕朝</h1>");
               out.println("</body>");
               out.println("</html>");
    }
}
