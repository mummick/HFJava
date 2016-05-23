package com.company;

/**
 * Created by lab on 20.04.16.
 */
class Player {
    static int playerCount = 0;
    private String name;
    public Player(String n) {
        name = n;
        playerCount++;
    }
}
public class p281e1 {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Iger Woods");
        System.out.println(Player.playerCount);
    }
}
