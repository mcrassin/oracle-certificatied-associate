package com.oca.coreAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author mcrassin
 * @since 24/04/2016
 */
public class Dates {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("default date format:" + date.toString());

        LocalDateTime time = LocalDateTime.now();
        System.out.println("default time format:" + time.toString());

        time = time.plusDays(2).plusHours(24); // careful, date is immutable
        System.out.println("plus 3 days:" + time.toString());
        System.out.println();

        System.out.println("formatter");
        System.out.println("ISO_DATE\t\t:" + time.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_TIME\t\t:" + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("ISO_DATE_TIME\t:" + time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        System.out.println("period");
        LocalDateTime now = LocalDateTime.of(2016, 2, 14, 0,0,0);
        Period p = Period.ofYears(1);
        System.out.println(now + " plus 1y period => " + now.plus(p));

        LocalTime rightNow = LocalTime.now();
        Duration d = Duration.ofSeconds(60);
        System.out.println(rightNow + " plus 60s duration => " + rightNow.plus(d));

        //rightNow.plus(p); // UnsupportedTemporalTypeException: Unsupported unit: Years
    }
}
