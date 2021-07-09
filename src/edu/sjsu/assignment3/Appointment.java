package edu.sjsu.assignment3;

import java.time.LocalDate;

public class Appointment implements Comparable<Appointment> {

    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    Appointment(String description, LocalDate startDate, LocalDate endDate)
    {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**+
     * Use to get the private variable description
     * @return this.description
     */
    public String getDescription() {
        return description;
    }

    /**+
     * Use to get the private variable startDate
     * @return this.startDate
     */

    public LocalDate getStartDate() {
        return startDate;
    }

    /**+
     * Use to get the private variable endDate
     * @return this.endDate
     */

    public LocalDate getEndDate() {
        return endDate;
    }

    /**+
     * Find if an appointment occurs on a given day
     * @param date day to be check if there is an appointment
     * @return true or false
     */
   public boolean occursOn(LocalDate date)
   {
      return false;
   }


    /**+
     * This method is use to help find if a meeting is occurring on a specific date. It return true if the date
     * is between the starting and ending date.
     * @param date The date that the user wish to find if it is between the starting and ending date
     * @return true if the parameter is between the starting and ending date or on those date
     */
   public boolean isBetween(LocalDate date){
        if (this.startDate.isBefore(date)&& this.endDate.isAfter(date))
        {
            return true;
        }
        if (this.startDate.isEqual(date)|| this.endDate.isEqual(date))
        {
            return true;
        }
        return false;
   }

    /**+
     * The compareTo method is used to compare appointment. It first use the start date to compare, then the end date
     * and finally the description to compare appointments.
     * @param o The appointment the this object will be compare to
     * @return an int, representing the comparison
     */

    @Override
    public int compareTo(Appointment o) {
       if (this.startDate==o.startDate &&this.endDate==o.endDate) return this.description.compareTo(o.description);
       if(this.startDate==o.startDate) return this.endDate.compareTo(o.endDate);
       return this.startDate.compareTo(o.startDate);
    }
}
