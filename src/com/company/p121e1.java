package com.company;

/**
 * Created by lab on 13.04.16.
 */
public class p121e1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                //some code
                x = x + 3;

                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
