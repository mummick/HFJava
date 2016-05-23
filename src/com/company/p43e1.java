package com.company;

/**
 * Created by lab on 11.04.16.
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

public class p43e1 {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playSnare();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
