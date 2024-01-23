package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void findTheGreatestCommonDivisor() {

        Engine.startTheGame("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < 3; i++) {
            Random r = new Random();
            int a = r.nextInt(1, 101);
            int b = r.nextInt(1, 101);
            String expression = a + ", " + b;
            int correctAnswer = gcdAlgorithm(a, b);
            Engine.questioning(expression, String.valueOf(correctAnswer));
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
