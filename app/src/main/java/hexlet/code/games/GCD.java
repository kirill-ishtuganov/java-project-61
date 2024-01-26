package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void findTheGreatestCommonDivisor() {
        Engine.startTheGame("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            int a = (int) (Math.random() * 100) + 1;
            int b = (int) (Math.random() * 100) + 1;
            String expression = a + " " + b;
            int correctAnswer = gcdAlgorithm(a, b);
            Engine.getQuestion(expression, String.valueOf(correctAnswer));
        }
        Engine.finishTheGame();
    }

    public static int gcdAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdAlgorithm(b, a % b);
    }
}
