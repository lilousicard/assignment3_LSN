package edu.sjsu.assignment3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {
    LocalDate startDate = LocalDate.parse("2021-06-01");
    LocalDate endDate = LocalDate.parse("2021-08-05");
    LocalDate testDate1 = LocalDate.parse("2021-06-05");
    LocalDate testDate2 = LocalDate.parse("2021-07-01");
    LocalDate testDate3 = LocalDate.parse("2021-08-15");

    @Test
    void occursOnBasic() {
        Appointment a = new Appointment("", null, null);
        //assertFalse(a.occursOn(null));
    }

    @Test
    void occursOnMonthly(){
        Appointment appointment1= new MonthlyAppointment("Class", testDate1, endDate);

        assertFalse(appointment1.occursOn(LocalDate.parse("2021-04-05")));
        assertTrue(appointment1.occursOn(LocalDate.parse("2021-07-05")));
        assertFalse(appointment1.occursOn(LocalDate.parse("2021-06-06")));


    }


    @Test
    void compareTo() {
        // chronogical order : SD-TD1-TD2-ED
        Appointment Monthly = new MonthlyAppointment("Class",startDate,endDate);
        Appointment Daily = new DailyAppointment("Doctor", testDate1,testDate2);
        assertSame(-4,Monthly.compareTo(Daily));
        assertSame(4,Daily.compareTo(Monthly));


    }
}