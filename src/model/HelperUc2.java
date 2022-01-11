package com.bridgelabz.fellowship.models;
import com.bridgelabz.fellowship.utils.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class HelperUc2 {
    List<PersonUc2> p = new ArrayList<PersonUc2>();
    //	ADD METHOD
    public void addRecord()
    {
        final String fname, lname, address, city, state, phone,zip,email;

        System.out.print("Enter First Name : ");
        fname = InputUtil.getStringValue();
        System.out.print("Enter Last Name : ");
        lname = InputUtil.getStringValue();
        System.out.print("Enter Phone Number : ");
        phone = InputUtil.getStringValue();
        System.out.print("Enter Address : ");
        address = InputUtil.getStringValue();
        System.out.print("Enter city : ");
        city = InputUtil.getStringValue();
        System.out.print("Enter zip : ");
        zip = InputUtil.getStringValue();
        System.out.print("Enter state : ");
        state = InputUtil.getStringValue();
        System.out.print("Enter email : ");
        email = InputUtil.getStringValue();

        p.add(new PersonUc2(fname,lname,address,city,state,phone,zip,email));
    } // END of addRecord()

    //	DISPLAY METHOD
    public void displayRecord()
    {
        for(PersonUc2 p1: p)
        {
            System.out.println(p1);
        }

    } // END OF displayRecord
}
