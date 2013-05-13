package com.mycompany.helloworld.cache;

import java.util.HashMap;

/**
 * <p>缓存管理
 * <p> Date: 13-5-10 Time: 下午3:54 </p>
 * see http://www.apkbus.com/android-15350-1-1.html
 * @author xizhao.xsz
 */
public class ReasonCacheManager {
    //TODO:xizhao.static 可以通过synchronized 来控制更新，但是对于一个应用在多台机器上，这个要怎么处理？
    private static HashMap reasonCacheMap = new HashMap();

    private ReasonCacheManager() {
        super();
    }

    /**
     * 获取布尔值的缓存
     * 这个method真心设计的很挫
     */
    public static boolean getSimpleFlag(String key) {
        try {
            return (Boolean) reasonCacheMap.get(key);
        } catch (NullPointerException e) {
            return false;
        }
    }

    /**-----------------------------------------synchroized start------------------*/
    public static synchronized  boolean setSimpleFlag(String key, boolean flag) {
        //要更新的值和已有缓存值相同
        if (flag && getSimpleFlag(key)) {
            return false;
        } else {
            reasonCacheMap.put(key, flag);
            return true;
        }
    }

    public static synchronized  void clearAll() {
        reasonCacheMap.clear();
    }

    public static synchronized void putCache(String key,ReasonCache ojbect) {
        reasonCacheMap.put(key,ojbect);
    }

    /**-----------------------------------------synchroized end------------------*/


    public static void buildCacheInfo(String key,ReasonCache reasonCache,long deathTime,boolean expired){
       ReasonCache cache = new ReasonCache();
        cache.setKey(key);
        cache.setTimeout(deathTime+System.currentTimeMillis());
        cache.setValue(reasonCache);
        cache.setExpired(expired);
        reasonCacheMap.put(key,cache);
    }
}
