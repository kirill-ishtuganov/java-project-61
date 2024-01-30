package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void findTheGreatestCommonDivisor() {
        String[][] questions = new String[Engine.getNumberOfQuestions()][2];

        for (var i = 0; i < questions.length; i++) {
            int a = (int) (Math.random() * Engine.getMaxNumber() * 2) + 1;
            int b = (int) (Math.random() * Engine.getMaxNumber() * 2) + 1;
            int correctAnswer = gcdAlgorithm(a, b);
            questions[i][0] = a + " " + b;
            questions[i][1] = String.valueOf(correctAnswer);
        }
        Engine.getQuestion("Find the greatest common divisor of given numbers.", questions);
    }

    public static int gcdAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdAlgorithm(b, a % b);
    }
}
