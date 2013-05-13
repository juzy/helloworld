package com.mycompany.helloworld.cache;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * <p> Date: 13-5-10 Time: 下午3:20 </p>
 *
 * @author xizhao.xsz
 */
public class ReasonCache {
    @Setter
    @Getter
    private String key;
    @Setter
    @Getter
    private Object value;
    @Setter
    @Getter
    private long timeout;
    @Setter
    @Getter
    private boolean expired;

    public ReasonCache() {
        super();
    }

    public ReasonCache(String key, Object value, long timeout, boolean expired) {
        this.key = key;
        this.value = value;
        this.timeout = timeout;
        this.expired = expired;
    }
}
