package com.medina.timesheets;

//user enters hours and minutes for in, out, lunch out, lunch in, outside office work and holiday hours
//I should be able to create one method to calculate these... and return the value. Perhaps as setters
//for each variable and then one method to calculate the value.

import java.time.*;

public class TestCode {

    LocalTime startTime;
    LocalTime endTime;


    long totalLunch = 0;
    long totalWorkTime = 0;
    long workedOutsideOffice = 0;
    long holidayHours = 0;
    long paidTimeOff = 0;
    long totalTime;
    long totalTimeInMinutes;



    public void calculateHoursWorked(){
        totalTime = totalWorkTime + workedOutsideOffice + paidTimeOff - totalLunch;
    }

    public long calcHoursAndMinutes(String start, String end){
        startTime = LocalTime.parse(start);
        endTime = LocalTime.parse(end);
        LocalTime totalTime = endTime.minusHours(startTime.getHour()).minusMinutes(startTime.getMinute());

        long totalHours = totalTime.getHour() * 60;
        long totalMinutes = totalTime.getMinute();

        return totalTimeInMinutes = totalHours + totalMinutes;
    }

    public void setTotalWorkTime(String hours, String minutes) {
        totalWorkTime = calcHoursAndMinutes(hours, minutes);
    }

    public void setTotalLunch(String hours, String minutes) {
        totalLunch = calcHoursAndMinutes(hours, minutes);
    }

    public void setHoursWorkedOutsideOffice(String hours, String minutes) {
        workedOutsideOffice = calcHoursAndMinutes(hours, minutes);
    }

    public void setTotalTimeInMinutes(String hours, String minutes) {
        totalTimeInMinutes = calcHoursAndMinutes(hours, minutes);
    }

    public void setHolidayHours(String hours, String minutes) {
        holidayHours = calcHoursAndMinutes(hours, minutes);
    }

    public void setPaidTimeOffHours(String hours, String minutes) {
        paidTimeOff = calcHoursAndMinutes(hours, minutes);
    }


}
