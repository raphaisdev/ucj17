package src.section5;

public class OverloadMethodClass {
    public static void main(String[] args) {
        calculateScore();

        int newScore = calculateScore(87650);
        System.out.println("New Score = " + newScore);

        newScore = calculateScore("Teste", 50);
        System.out.println("New Score = " + newScore);

        newScore = calculateScore(100, 50, 200);
        System.out.println("New Score = " + newScore);

    }

    public static void calculateScore() {
        System.out.println("Unamed not scored");
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " scored: " + score);
        return score*1000;
    }

    public static int calculateScore(int base, int score, int bonus) {
        System.out.println("Unamed scored: " + (base + score + bonus));
        return (base + score + bonus) * 1000;
    }
}
