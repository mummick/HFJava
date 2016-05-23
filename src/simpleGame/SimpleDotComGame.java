package simpleGame;

/**
 * Created by lab on 13.04.16.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while(isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            if(result.equals("kill")) {
                isAlive = false;
            }
            numOfGuesses++;
        }
        System.out.println("You took " + numOfGuesses + " guesses");
    }
}
