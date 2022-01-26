package com.medina.timesheets;

/**
 * This class holds all fields for a day, including getters and setters.
 * All calculations are handled in the TimeshetCalculations Class.
 */
public class Day {

    private String day, start, end, lunchStart, lunchEnd;
    private float totalWorkHours;

    public Day (String day, String start, String end, String lunchStart, String lunchEnd){
        this.day = day;
        this.start = start;
        this.end = end;
        this.lunchStart = lunchStart;
        this.lunchEnd = lunchEnd;
    }

    public String getDay(){
        return day;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLunchStart() {
        return lunchStart;
    }

    public void setLunchStart(String lunchStart) {
        this.lunchStart = lunchStart;
    }

    public String getLunchEnd() {
        return lunchEnd;
    }

    public void setLunchEnd(String lunchEnd) {
        this.lunchEnd = lunchEnd;
    }

    public void setTotalWorkHours(float totalWorkHours) {
        this.totalWorkHours = totalWorkHours;
    }

    public float getTotalWorkHours(){
        return totalWorkHours;
    }
}
