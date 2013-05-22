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

    public static Action create(String actionName) {
        Class klass = ActionNameEnum.fromKeyCode(actionName).getKlass();
        if (null == klass) {
            throw new IllegalArgumentException("can not find action class:" + actionName);
        }
        Action actionInstance = null;
        try {
            actionInstance = (Action) klass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return actionInstance;
    }

    public enum ActionNameEnum {
        BOOTSTRAP("index", BootstrapAction.class),
        ADDCONTACT("addContactAction", AddContactAction.class),
        REMOVECONTACT("removeContactAction", RemoveContactAction.class);

        private ActionNameEnum(String keyCode, Class klass) {
            this.keyCode = keyCode;
            this.klass = klass;
        }

        @Getter
        private final String keyCode;
        @Getter
        private final Class klass;

        public static ActionNameEnum fromKeyCode(String keycode) {
            for (ActionNameEnum each : ActionNameEnum.values()) {
                if (each.getKeyCode().equalsIgnoreCase(keycode)) {
                    return each;
                }
            }
            return null;


        }

    }
}
