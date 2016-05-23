package com.company;

/**
 * Created by lab on 23.05.16.
 */
public class p294e1 {
    public static void main(String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);
        s = String.format("I have %,.2f bugs to fix", 123123.4567);
        System.out.println(s);
    }
}
