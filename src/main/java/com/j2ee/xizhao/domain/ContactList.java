package com.j2ee.xizhao.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * <p> Date: 13-5-16 Time: 下午5:22 </p>
 *
 * @author xizhao.xsz
 */
public class ContactList {
    public static List<Contact> getContacts()
    {
            List<Contact> contacts = new ArrayList<Contact>();
        Contact con1= new Contact(),con2= new Contact();
        con1.setFirstName("name1");
        con1.setId(1l);
        con1.setLastName("last");
        con1.setStreet("wensanRoad");
        con2.setFirstName("name2");
         con2.setId(2l);
         con2.setLastName("2last");
         con2.setStreet("wenerRoad");
        return  contacts;
    }
}
