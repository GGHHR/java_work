package com.work;
import lombok.Data;

import javax.sound.midi.SoundbankResource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Data
public class Date_ {
    int age = 10;
    public static void main(String[] args) throws ParseException, InterruptedException {
        SimpleDateFormat aa = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
        Date date = new Date();

        System.out.println(aa.format(Calendar.getInstance().getTimeInMillis()));

        System.out.println(date.getTime());
        Thread.sleep(1000);

        System.out.println(date.before(new Date()));
        System.out.println(aa.parse("2020-09-27 11:11:11"));
    }
}
