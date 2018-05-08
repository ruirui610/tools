package com.rui.date;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestCurrentDate {
    @Test
    public void testGetToday(){
        CurrentDate date = new CurrentDate();
        System.out.println(date.getToday());
        assertEquals("2018-05-08",date.getToday(),"2018-05-08 00:00:00");
    }
}
