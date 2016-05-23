package com.company;

/**
 * Created by lab on 11.04.16.
 */
public class p37e1 {
    public static void main(String[] args) {
        //code for testing movie class
        Movie one = new Movie();
        one.title = "Gone with Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic, but ultimately uplifting";
        three.rating = 127;
        three.playIt();
    }
}
class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie: " + title);
    }
}
