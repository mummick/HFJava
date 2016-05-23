package simpleGame;

import java.util.ArrayList;

/**
 * Created by lab on 13.04.16.
 */
public class DotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random()*5);
        ArrayList<String> locations = new ArrayList<String>();

        for(int i=0; i<3; i++) {
            locations.add(Integer.toString(randomNum+i));
        }
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while(isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            if(result.equals("kill")) {
                isAlive = false;
            }
            numOfGuesses++;
        }
        System.out.println("You took " + numOfGuesses + " guesses");
    }
}
