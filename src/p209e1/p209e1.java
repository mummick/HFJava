package p209e1;

/**
 * Created by lab on 19.04.16.
 */
abstract class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
public class p209e1 {
    public static void main(String[] args) {
        Dog a = new Dog();
        Cat c = new Cat();

        if (a.equals(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(c.getClass());
        System.out.println(c.hashCode());
        System.out.println(c.toString());
    }
}
