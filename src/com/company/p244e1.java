package com.company;

/**
 * Created by lab on 19.04.16.
 */
class Dduck {
    int size;
     public Dduck(int duckSize) {
         System.out.println("Quack!");
         size = duckSize;
         System.out.println("Size is " + size);
     }
}
public class p244e1 {
    public static void main(String[] args) {
        Dduck d = new Dduck(42);
    }
}
