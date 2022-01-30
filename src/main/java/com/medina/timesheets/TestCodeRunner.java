package com.medina.timesheets;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TestCodeRunner {

    public static void main(String[] args){

       // TestCode testCode = new TestCode();

      //  testCode.calculateHoursWorked();
        parseInput("08:30", "17:30");

    }

    public static void parseInput(String start, String end){


        try {
            LocalTime startTime = LocalTime.parse(start);
            LocalTime endTime = LocalTime.parse(end);
            System.out.println(startTime +" " + endTime);

        } catch (DateTimeParseException e) {
            System.out.println("Parsing of input failed");
            e.printStackTrace();
        }


    }


}
