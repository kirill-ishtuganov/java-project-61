package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void expressionEvaluation() {

        Engine.startTheGame("What is the result of the expression?");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            Random r = new Random();
            int maxNumberMinusOne = 21;
            int numberOfMathematicalOperations = 3;
            int a = r.nextInt(maxNumberMinusOne);
            int b = r.nextInt(maxNumberMinusOne);
            int c = r.nextInt(numberOfMathematicalOperations);
            String symbol;
            int correctAnswer;

            switch (c) {
                case 0:
                    symbol = " + ";
                    correctAnswer = a + b;
                    break;
                case 1:
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
