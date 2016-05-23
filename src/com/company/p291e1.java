package com.company;

/**
 * Created by lab on 23.05.16.
 */
class TestBox {
    Integer i = 0;
    int j;

    void go() {
        j=i;
        System.out.println(i);
        System.out.println(j);
    }
}
public class p291e1 {
    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
}

