package com.company;

/**
 * Created by lab on 19.04.16.
 */
class TAnimal {
    public void tST() {
        System.out.print("animal");
    }
}
class TDog extends TAnimal {
    public void tST() {
        System.out.print("dog");
    }
    public void tTT() {
        System.out.print("tTT");
    }
}
public class testttt {
    public static void main(String[] args) {
        TDog d = new TDog();
        TAnimal a = d;
        a.tST();
        d.tST();
        d.tTT();
    }
}
