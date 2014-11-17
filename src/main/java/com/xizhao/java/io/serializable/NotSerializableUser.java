package com.xizhao.java.io.serializable;

import lombok.Setter;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * User: xizhao.xsz
 * Time:2014-08-06 16:08
 * throw java.io.NotSerializableException: com.xizhao.java.io.serializable.NotSerializableUser
 * at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1164)
 at java.io.ObjectOutputStream.wri teObject(ObjectOutputStream.java:330)
 at com.xizhao.java.io.serializable.NotSerializableUser.main(NotSerializableUser.java:31)
 */
public class NotSerializableUser {
    @Setter
    private Long userId;
    @Setter
    private String userName;
    public NotSerializableUser(Long userId, String userName) {
        this.userId = userId;
        this.userName=userName;

    }
    public static void main(String [] args){
        NotSerializableUser user= new NotSerializableUser(1L,"matthow");
        try {
            FileOutputStream fileOutputStream= new FileOutputStream("\\user");
            ObjectOutputStream os =new ObjectOutputStream(fileOutputStream);
            os.writeObject(user);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
