package com.work;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_ {
    public static   void main(String[] args) {

        Calendar calendar=Calendar.getInstance();
        calendar.set(2020,9,10);
        System.out.println(Calendar.getInstance());



        SimpleDateFormat aa = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(aa.format(calendar.getTimeInMillis()));
    }


}
