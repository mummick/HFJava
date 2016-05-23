package com.company;

/**
 * Created by lab on 08.04.16.
 */
public class p23e1 {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while (x < 5) {
            //some code
            if (y < 5){
                x = x + 1;
                if (y < 3){
                    x = x - 1;
                }
            }
            y = y + 2;
            //end of some code
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
