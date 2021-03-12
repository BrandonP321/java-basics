package methods.src;

public class App {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int myScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(myScore);

        // calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score: " + finalScore);
            return finalScore;
        }

        return -1;
    }
}
