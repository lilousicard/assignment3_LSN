package edu.sjsu.assignment3;

import java.time.LocalDate;

public class DailyAppointment extends Appointment{


    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }


    /**+
     * This function returns a boolean telling if there is an appointment the day that as been pass as a parameter
     * @param date The day to find is there is an appointment
     * @return true or false
     */
    @Override
    public boolean occursOn(LocalDate date) {
        return (isBetween(date));
    }
}
