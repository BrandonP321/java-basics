package KeywordsAndExpressions.src;

public class App {
    public static void main(String[] args) {
        // 1 mile = 1.609344
        double kilometers = ( 100 * 1.609344);
        // double = keyword
        // kilometers = ( 100 * 1.609344) = expression


        // METHOD OVERLOADING (same method name with different parameters)
        calculateScore("Tim", 500);

        // calls second method since a single integer parameter is passed
        calculateScore(50);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println(score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return 0;
        }

        int totalInches = (feet * 12) + inches;
        double centimeters = calcFeetAndInchesToCentimeters(totalInches);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return 0;
        }
        double centimeters = inches * 2.54;
        return centimeters;
    }
}
