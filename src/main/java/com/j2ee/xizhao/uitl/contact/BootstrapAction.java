package com.j2ee.xizhao.uitl.contact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午5:05 </p>
 *
 * @author xizhao.xsz
 */
public class BootstrapAction extends  ContactsAction {
    @Override
    public String perform(final HttpServletRequest request, final HttpServletResponse response) {
       //TODO:xizhao
        return "/"+"constactList.jsp";
    }

    @Override
    public void writeToResponseStream(final HttpServletResponse response, final String output) {
        //TODO:xizhao
        throw new RuntimeException("This method is not implemented yet!");
    }
}
