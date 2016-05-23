package com.company;

/**
 * Created by lab on 12.04.16.
 */
class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go(int arg) {
        arg = arg *2;
        return arg;
    }
}
public class p88e1 {
}
