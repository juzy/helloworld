package com.j2ee.xizhao.uitl.contact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午5:14 </p>
 *
 * @author xizhao.xsz
 */
public class AddContactAction extends ContactsAction {
    @Override
    public String perform(final HttpServletRequest request, final HttpServletResponse response) {
        throw new RuntimeException("This method is not implemented yet!");
    }

    @Override
    public void writeToResponseStream(final HttpServletResponse response, final String output) {
        throw new RuntimeException("This method is not implemented yet!");
    }
}
