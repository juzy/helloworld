package com.j2ee.xizhao.uitl.contact;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午4:05 </p>
 *
 * @author xizhao.xsz
 */
public class ActionFactory {


    public static Map map;

    static {
        map = defaultMap();
    }

    public static Action create(ActionNameEnum actionNameEnum) {
        Class klass = (Class) map.get(actionNameEnum.getClassName());
        if (null == klass) {
            throw new IllegalArgumentException("can not find action class:" + actionNameEnum.getClassName());
        }
        Action actionInstance = null;
        try {
            actionInstance = (Action) klass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return actionInstance;
    }

    private static Map defaultMap() {
        Map map = new HashMap();
        map.put("index", BootstrapAction.class);
        return map;
    }

    public enum ActionNameEnum {
        //FIXME:xizhao
        BOOTSTRAP("index", BootstrapAction.class.getName()),
        ADDCONTACT("addContactAction", AddContactAction.class.getName()),
        REMOVECONTACT("removeContactAction", RemoveContactAction.class.getName());

        private ActionNameEnum(String keyCode, String className) {
            this.keyCode = keyCode;
            this.className = className;
        }

        @Getter
        private final String keyCode;
        @Getter
        private final String className;
    }
}
