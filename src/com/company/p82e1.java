package com.company;

/**
 * Created by lab on 12.04.16.
 */
class GoodDog {
    private int size;
    public int getSize () {
        return size;
    }
    public void setSize (int s) {
        size = s;
    }
    void bark () {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
public class p82e1 {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}
