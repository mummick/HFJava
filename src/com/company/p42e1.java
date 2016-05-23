package com.company;

/**
 * Created by lab on 11.04.16.
 */
class TapeDeck {

    boolean canRecord = false;

    void playTape() {
        System.out.println("Tape playing");
    }

    void recordTape() {
        if (canRecord) {
            System.out.println("Tape recording");
        } else {
            System.out.println("Error! Can't record!");
        }
    }
}
public class p42e1 {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
