package com.codewithmurali;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFun {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String date1;
        String date2;
        date1 = sc.next();
        date2 = sc.next();
        Date signupDate = new SimpleDateFormat("dd-MM-yyyy").parse(date1);
        Date currentDate= new SimpleDateFormat("dd-MM-yyyy").parse(date2);

        Calendar cal1= Calendar.getInstance();
        cal1.setTime(signupDate);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(currentDate);
        System.out.println(cal1.get(Calendar.YEAR));
    }
}
