package com.j2ee.xizhao.uitl.contact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午4:07 </p>
 *
 * @author xizhao.xsz
 */
public interface Action {
    public String perform(HttpServletRequest request, HttpServletResponse response);
    public void writeToResponseStream(HttpServletResponse response,String output);
}
