package com.xizhao.design.event;

/**
 * <p>
 * <p> Date: 13-5-22 Time: 下午2:29 </p>
 *
 * @author xizhao.xsz
 */
public interface MyEvent {
    public static final String createEvent = "CREATE_EVENT";
    public static final String deleteEvent = "DELETE_EVENT";
    public static final String updateEvent = "UPDATE_EVENT";

    public String getEvent();
}
