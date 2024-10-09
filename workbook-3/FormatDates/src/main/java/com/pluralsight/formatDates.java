package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class formatDates {
    public static void main(String[] args) {

        LocalDateTime currentDate = LocalDateTime.now(); // 2024-10-09 format (standard format)
        System.out.println("Today is " + currentDate);

        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //changing format
        String formattedDate = currentDate.format(frmt);
        System.out.println("Today is " + formattedDate);

        DateTimeFormatter frmt2 = DateTimeFormatter.ofPattern("MMMM d, yyyy"); //October 9, 2024
        String formattedDate2 = currentDate.format(frmt2);
        System.out.println("Today is " + formattedDate2);


        DateTimeFormatter frmt3 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy"); //challenge format
        String formattedDate3 = currentDate.format(frmt3);
        System.out.println("Today is " + formattedDate3);



       // GMT time zone challenge
        Date date = new Date(); // java.util.Date
        SimpleDateFormat format = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm 'in GMT' ");
        format.setTimeZone(TimeZone.getTimeZone("GMT")); //setting a time zone
        String gmtTime = format.format(date);
        System.out.println(gmtTime);




    }
}
