package com.medina.timesheets;
/**
 * This Class contains the methods to calculate hours worked
 */

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;

public class TimesheetCalculations {

    private LocalTime startTime;
    private LocalTime endTime;

    private long totalLunch;
    private long totalWorkTime;
    private float totalTime;
    private long totalTimeInMinutes;


 

    public float calculateHoursWorked(long totalWorkTime, long totalLunch) {
        return totalTime = (totalWorkTime - totalLunch) / 60.0f;
    }

    public long findTotalWorkTime(String hours, String minutes) {
        return totalWorkTime = calcHoursAndMinutes(hours, minutes);
    }

    public long findTotalLunch(String hours, String minutes) {
        return totalLunch = calcHoursAndMinutes(hours, minutes);
    }

    //This method parses the input to ensure it follows the 24-hour hh:mm format required by LocalTime.

    public void parseInput(String start, String end){

                startTime = LocalTime.parse(start);
                endTime = LocalTime.parse(end);
    }

    //This method calculates the total time in minutes based on two string inputs for the start and end time of a period
    public long calcHoursAndMinutes(String start, String end) {

       parseInput(start, end);

           LocalTime totalTime = endTime.minusHours(startTime.getHour()).minusMinutes(startTime.getMinute());

           long totalHours = totalTime.getHour() * 60;
           long totalMinutes = totalTime.getMinute();

           return totalTimeInMinutes = totalHours + totalMinutes;

    }
}


