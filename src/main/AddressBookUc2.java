package com.bridgelabz.fellowship.main;
/*
 *main code for address book management
 *this file is the gateway for all functions
 */
import com.bridgelabz.fellowship.utils.*;

public class AddressBookUc2 {
    public static void main(String[] args) {
        int choice,i=0;
        final com.bridgelabz.fellowship.models.HelperUc2 help = new com.bridgelabz.fellowship.models.HelperUc2();
        while(i==0)
        {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Display Records     ");
            System.out.println("3: Exit		       \n");
            System.out.println("--- Enter Your Choice ---");
            choice = InputUtil.getIntValue();
            switch(choice)
            {
                case 1 :
                    help.addRecord();
                    break;
                case 2 :
                    help.displayRecord();
                    break;
                case 3 :
                    i=1;
                    break;
                default :
                    System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}
