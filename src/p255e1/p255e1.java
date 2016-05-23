package p255e1;

/**
 * Created by lab on 20.04.16.
 */
abstract class Animal {
    private String name;
    public String getName() {
        return name;
    }
    public Animal (String theName) {
        name = theName;
    }
}
class Hippo extends Animal {
    public Hippo(String theName) {
        super(theName);
    }
}
public class p255e1 {
    public static void main(String[] args) {
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());
    }
}
