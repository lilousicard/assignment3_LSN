package edu.sjsu.assignment3;

import java.time.LocalDate;

public class MonthlyAppointment extends Appointment{
    MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    /**+
     * This function returns a boolean telling if there is an appointment the day that as been pass as a parameter.
     * The date input need to be on the same day of the month to return true
     * @param date The day to find is there is an appointment
     * @return True or false
     */

    @Override
    public boolean occursOn(LocalDate date) {
        if (this.isBetween(date))
        {
            if (this.getStartDate().getDayOfMonth() == date.getDayOfMonth())
            {
                return true;
            }
            return false;
        }
        return false;
    }
}
