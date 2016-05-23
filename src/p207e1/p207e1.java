package p207e1;

/**
 * Created by lab on 19.04.16.
 */
abstract class Animal {

}
class Dog extends Animal {

}
class Cat extends Animal {

}
class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex);
            nextIndex++;
        }
    }
}
public class p207e1 {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat b = new Cat();
        list.add(a);
        list.add(b);
    }
}
