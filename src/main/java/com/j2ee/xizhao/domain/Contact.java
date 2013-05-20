package com.j2ee.xizhao.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * <p> Date: 13-5-16 Time: 下午5:23 </p>
 *
 * @author xizhao.xsz
 */
public class Contact {
    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    private String firstName;
    @Setter
    @Getter
    private String lastName;
    @Setter
    @Getter
    private String street;

    public enum ContactParaEnum {
        ID("id"),
        FIRST_NAME("firstName"),
        LAST_NAME("lastName"),
        STREET("street");

        @Getter
        private final String para;

        private ContactParaEnum(String para) {
            this.para = para;
        }
    }


}
