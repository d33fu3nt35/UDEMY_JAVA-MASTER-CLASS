package Expressions;

/**
 * Created by daniel on 6/17/17.
 */
public class Methods {

    public static void main(String[] args) {

        calculateScore(true, 6000, 5, 100);

       int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Daniel", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Marc", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Emilio", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Evan", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if(playerScore >= 100 && playerScore < 500){
            return 3;
        } else{
            return 4;
        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

}
