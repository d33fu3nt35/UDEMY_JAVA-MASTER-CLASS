package Expressions;

/**
 * Created by daniel on 6/17/17.
 */
public class Methods {

    public static void main(String[] args) {

        calculateScore(true, 6000, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

}
