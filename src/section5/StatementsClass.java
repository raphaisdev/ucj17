package src.section5;

public class StatementsClass {
    public static void main(String[] args) {
        int myInt = 50;
        myInt++;
        myInt--;
        System.out.println(myInt);

        System.out.println("Test1");
        System.out.println("Test2" + " teste3 ");
        System.out.println("Test4" +
                " teste5 " +
                "teste6");

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("You win!");
        } else if (score < 5000) {
            System.out.println("You lose!");
        } else {
            System.out.println("Draw!");
        }

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

        boolean gameOver1 = true;
        int score1 = 10000;
        int levelCompleted1 = 8;
        int bonus1 = 200;
        int finalScore1 = score1;

        if (gameOver1) {
            finalScore1 += (levelCompleted1 * bonus1);
            System.out.println("Your final score is: " + finalScore1);
        }

        score1 = 1000;
        levelCompleted1 = 7;
        bonus1 = 150;
        finalScore1 = score1;

        if (gameOver1) {
            finalScore1 += (levelCompleted1 * bonus1);
            System.out.println("Your final score is: " + finalScore1);
        }

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 7200, 11, 350);

        System.out.println("Your final score is: " + returnedCalculateScore(gameOver, score, levelCompleted, bonus));

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += (levelCompleted + bonus);
            System.out.println("Your final score is: " + finalScore);
        }
    }

    public static int returnedCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += (levelCompleted + bonus);
        }
        return finalScore;
    }
}
