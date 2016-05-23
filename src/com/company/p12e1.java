package com.company;

/**
 * Created by lab on 08.04.16.
 */
public class p12e1 {
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before the loop");
        while (x < 4){
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.print("After the loop");
    }
}
