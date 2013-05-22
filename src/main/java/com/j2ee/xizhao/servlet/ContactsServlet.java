package com.j2ee.xizhao.servlet;

import com.j2ee.xizhao.uitl.contact.Action;
import com.j2ee.xizhao.uitl.contact.ActionFactory;
import com.j2ee.xizhao.uitl.contact.ActionFactory.ActionNameEnum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午3:25 </p>
 *
 * @author xizhao.xsz
 */
public class ContactsServlet extends HttpServlet {
    public ContactsServlet() {
        super();
    }

    protected String getActionName(HttpServletRequest request) {
        String path = request.getServletPath();
        return path.substring(1,path.lastIndexOf("."));
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Action action = ActionFactory.create(getActionName(request));
        String url = action.perform(request, response);
        if (null != url) {
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
    }

}
