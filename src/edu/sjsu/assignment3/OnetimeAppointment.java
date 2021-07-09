package edu.sjsu.assignment3;

import java.time.LocalDate;

public class OnetimeAppointment extends Appointment{

    OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }

    /**+
     * This function takes a date as an input an return true if there is an appointment on that day
     * and false otherwise
     * @param date The date to find if there is an appointment on that day
     * @return True or false
     */
    @Override
    public boolean occursOn(LocalDate date) {
        return this.getStartDate().isEqual(date);
    }
}
