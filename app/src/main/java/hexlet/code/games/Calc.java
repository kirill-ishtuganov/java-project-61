package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void expressionEvaluation() {

        Engine.startTheGame("What is the result of the expression?");

        for (var i = 0; i < 3; i++) {
            Random r = new Random();
            int a = r.nextInt(20);
            int b = r.nextInt(20);
            int c = r.nextInt(3) + 1;
            String symbol;
            int correctAnswer;

            switch (c) {
                case 1:
                    symbol = " + ";
                    correctAnswer = a + b;
                    break;
                case 2:
                    symbol = " - ";
                    correctAnswer = a - b;
                    break;
                default:
                    symbol = " * ";
                    correctAnswer = a * b;
            }

            String expression = a + symbol + b;
            Engine.getQuestion(expression, String.valueOf(correctAnswer));
        }
        Engine.finishTheGame();
    }
}
