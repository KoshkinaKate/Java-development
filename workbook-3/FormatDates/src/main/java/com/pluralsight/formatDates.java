package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class formatDates {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now(); // 2024-10-09 format (standard format)
        System.out.println("Today is " + currentDate);

        DateTimeFormatter frmt = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //changing format
        String formattedDate = currentDate.format(frmt);
        System.out.println("Today is " + formattedDate);

        DateTimeFormatter frmt2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy"); //October 9, 2024
        String formattedDate2 = currentDate.format(frmt2);
        System.out.println("Today is " + formattedDate2);

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter frmt3 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy"); //challenge format
        String formattedDate3 = currentDateTime.format(frmt3);
        System.out.println("Today is " + formattedDate3);



       // GMT time zone challenge - does not work
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));  // Set time zone to GMT
        String formattedDate4 = format.format();  // Format the date
        System.out.println("Formatted GMT date: " + formattedDate4);



    }
}
