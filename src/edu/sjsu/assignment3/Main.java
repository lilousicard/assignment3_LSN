package edu.sjsu.assignment3;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-05");
        LocalDate testDate1 = LocalDate.parse("2021-06-05");
        LocalDate testDate2 = LocalDate.parse("2021-07-01");
        LocalDate testDate3 = LocalDate.parse("2021-08-15");

        Appointment appointment1= new MonthlyAppointment("Class", testDate1, endDate);
        Appointment appointment2 = new MonthlyAppointment("Diner",startDate, endDate);
        Appointment array [] = {appointment2,appointment1};




    }
}
