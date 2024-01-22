package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Random;

public class Calc {
    public static void expressionEvaluation() {

        Cli.getUserName();
        System.out.println("What is the result of the expression?");

        Random r = new Random();

        for (var i = 0; i < 3; i++) {
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
            Engine.questioning(expression, String.valueOf(correctAnswer));
        }

        System.out.println("Congratulations, " + Cli.userName + "!");
        System.exit((0));
    }
}
