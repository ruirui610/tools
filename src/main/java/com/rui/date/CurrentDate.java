package com.rui.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public String getToday(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String time = format.format(now);
        String zeroTime = " 00:00:00";
        time = time+zeroTime;
        return time;
    }
}
