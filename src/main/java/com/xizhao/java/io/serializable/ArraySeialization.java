package com.xizhao.java.io.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * User: xizhao.xsz
 * Time:2014-08-19 17:45
 */
public class ArraySeialization  implements Serializable {
    public static void main(String [] args){
        ArrayList<String> list  = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");

        try {
            FileOutputStream fileOutputStream= new FileOutputStream("\\arraySeializationFile");
            ObjectOutputStream os =new ObjectOutputStream(fileOutputStream);
            os.writeObject(list);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
