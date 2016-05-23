package p73e1;

/**
 * Created by lab on 12.04.16.
 */
class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            bark();
            numOfBarks = numOfBarks - 1;
        }
    }
}
public class p73e1 {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark(2);
        three.bark();
    }
}
