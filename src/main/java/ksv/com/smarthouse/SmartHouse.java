package ksv.com.smarthouse;

import java.util.Date;

public abstract class SmartHouse {
    String address = "Address Smart House - Kyiv, street Veresneva 48/77 room ";

    public void addressSH() {
        System.out.println(address);
    }

    public static String currentDateAndTime() {
        Date date = new Date();
        return (date.toString());
    }

}
