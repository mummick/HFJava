package com.company;

/**
 * Created by lab on 11.04.16.
 */
public class p36e1 {
    public static void main(String[] args){
        //test for Dog
        Dog d = new Dog();

        d.size = 40;
        d.bark();
    }
}
class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}
