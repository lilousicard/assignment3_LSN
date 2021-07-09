package edu.sjsu.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    void occursOn() {
        Appointment a = new Appointment("", null, null);
        assertFalse(a.occursOn(null));
    }

    @Test
    void compareTo() {
    }
}