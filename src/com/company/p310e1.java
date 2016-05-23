package com.company;

/**
 * Created by lab on 23.05.16.
 */
class StaticSuper {
    static {
        System.out.println("Super static block");
    }

    StaticSuper() {
        System.out.println("Super static constructor");
    }
}
class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }
    StaticTests() {
        System.out.println("Static tests constructor");
    }
}
public class p310e1 {
    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}
