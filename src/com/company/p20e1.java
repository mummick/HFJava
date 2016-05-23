package com.company;

import java.awt.*;

/**
 * Created by lab on 08.04.16.
 */
public class p20e1 {
    public static void main(String[] args){
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2){
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }

    }
}
