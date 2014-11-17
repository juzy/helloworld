package com.xizhao.java.io.serializable.abs;

import lombok.Setter;

import java.io.*;

/**
 * User: xizhao.xsz
 * Time:2014-09-01 19:57
 */
public class SerializableUser extends AbsNoSerialUser implements Serializable {
    @Setter
    private Long userId;
    @Setter
    private String userName;

    SerializableUser(Long userId, String userName) {
         this.userId = userId;
        this.userName = userName;
        this.setSuperUserId(1L);
        this.setSuperUserName("superName");
    }

    public static void main(String[] args) {
        SerializableUser user = new SerializableUser(1L, "matthow");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("\\user");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(user);
            os.close();
            FileInputStream fileInputStream = new FileInputStream("\\user");
            ObjectInputStream inputStream= new ObjectInputStream(fileInputStream);
            SerializableUser serializableUser= (SerializableUser)  inputStream.readObject();
            System.out.print("superuserId="+serializableUser.getSuperUserId()+"");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
