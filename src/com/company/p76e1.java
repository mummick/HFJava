package com.company;

/**
 * Created by lab on 12.04.16.
 */
class TakeTwo {
    void takeTwo(int x, int y) {
        int z = x + y;
        System.out.print("Total is " + z);
    }
}
public class p76e1 {
    public static void main(String[] args) {
        int foo = 7;
        int bar = 3;
        TakeTwo t = new TakeTwo();

        t.takeTwo(foo, bar);

    }
}
