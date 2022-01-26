package com.medina.timesheets;

/**
 * This is the controller class for the UI, Day and TimesheetController classes.
 * Several Day objects are currently commented out until tests have been completed
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import java.util.ArrayList;
import java.util.List;

public class TimesheetController {

        @FXML
        private TextArea mStart;

        @FXML
        private TextArea mLunchStart;

        @FXML
        private TextArea mLunchEnd;

        @FXML
        private TextArea mEnd;

        @FXML
        private TextArea mondayTotal;

        @FXML
        private TextArea tStart;

        @FXML
        private TextArea tLunchStart;

        @FXML
        private TextArea tLunchEnd;

        @FXML
        private TextArea tEnd;

        @FXML
        private TextArea tuesdayTotal;

        @FXML
        private TextArea wStart;

        @FXML
        private TextArea wLunchStart;

        @FXML
        private TextArea thLunchStart;

        @FXML
        private TextArea thStart;

        @FXML
        private TextArea wEnd;

        @FXML
        private TextArea wLunchEnd;

        @FXML
        private TextArea fEnd;

        @FXML
        private TextArea fLunchEnd;

        @FXML
        private TextArea fLunchStart;

        @FXML
        private TextArea fStart;

        @FXML
        private TextArea thEnd;

        @FXML
        private TextArea thLunchEnd;

        @FXML
        private TextArea fridayTotal;

        @FXML
        private TextArea thursdayTotal;

        @FXML
        private TextArea wednesdayTotal;

        private long workHour;
        private long lunchHour;

        Day monday, tuesday, wednesday, thursday, friday;

        TimesheetCalculations calc = new TimesheetCalculations();
        List <Day> fullWeek = new ArrayList<>();

        public void addDaysToList(){

                        monday = new Day("Monday", mStart.getText(), mEnd.getText(), mLunchStart.getText(), mLunchEnd.getText());
                      //  tuesday = new Day("Tuesday", tStart.getText(), tEnd.getText(), tLunchStart.getText(), tLunchEnd.getText());
                      //  wednesday = new Day("Wednesday", wStart.getText(), wEnd.getText(), wLunchStart.getText(), wLunchEnd.getText());
                       // thursday = new Day("thursday", thStart.getText(), thEnd.getText(), thLunchStart.getText(), thLunchEnd.getText());
                       // friday = new Day("Friday", fStart.getText(), fEnd.getText(), fLunchStart.getText(), fLunchEnd.getText());

                fullWeek.add(monday);
               // fullWeek.add(tuesday);
               // fullWeek.add(wednesday);
              //  fullWeek.add(thursday);
             //   fullWeek.add(friday);
        }


        public void calculateHoursWorked(){

                addDaysToList();

                try {
                        for (Day day : fullWeek) {
                                workHour = calc.findTotalWorkTime(day.getStart(), day.getEnd());
                                lunchHour = calc.findTotalLunch(day.getLunchStart(), day.getLunchEnd());
                                day.setTotalWorkHours(calc.calculateHoursWorked(workHour, lunchHour));
                        }
                } catch(NullPointerException e){
                        displayAlert(AlertType.ERROR, "Missing or Incorrect Entry", "Please review your timesheet and ensure all fields "
                                +"have been completed in a 24-hour hh:mm format");
                }
        }

        public void displayAlert(AlertType type, String title, String message) {
                Alert alert = new Alert(type);
                alert.setTitle(title);
                alert.setContentText(message);
                alert.showAndWait();
        }

        @FXML
        void calcTotalTime(ActionEvent event){

              calculateHoursWorked();
              mondayTotal.setText(String.valueOf(monday.getTotalWorkHours()));
              //tuesdayTotal.setText(String.valueOf(tuesday.getTotalWorkHours()));
              //wednesdayTotal.setText(String.valueOf(wednesday.getTotalWorkHours()));
              //thursdayTotal.setText(String.valueOf(thursday.getTotalWorkHours()));
              //fridayTotal.setText(String.valueOf(friday.getTotalWorkHours()));
        }
    }


