package com.company;

/**
 * Created by lab on 12.04.16.
 */
class PoorDog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}
public class p84e1 {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}
