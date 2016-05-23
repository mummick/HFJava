package com.company;

/**
 * Created by lab on 12.04.16.
 */
class Clock {
    private String time;

    void setTime(String t) {
        time = t;
    }
    String getTime() {
        return time;
    }
}
public class p88e2 {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("Time is " + tod);
    }
}
