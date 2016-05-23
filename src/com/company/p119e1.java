package com.company;

/**
 * Created by lab on 13.04.16.
 */
public class p119e1 {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++){
            for(int y = 4; y > 2; y--){

                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }
    }
}
