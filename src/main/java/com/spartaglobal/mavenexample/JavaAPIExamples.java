package com.spartaglobal.mavenexample;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class JavaAPIExamples {

    public void example(){
        System.out.println(Math.sqrt(25));
    }

    public void dateTimes(){
        System.out.println(LocalDate.now());
        LocalDate localDate = LocalDate.of(1994, Month.DECEMBER, 16);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
    }

}
