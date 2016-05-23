package p39e1;

/**
 * Created by lab on 11.04.16.
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
