package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {

    static final int ACTIONS = 3;
    public static void expressionEvaluation() {
        Engine.startTheGame("What is the result of the expression?");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            int a = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int b = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int c = (int) (Math.random() * ACTIONS);
            String symbol;

            int correctAnswer = switch (c) {
                case 0 -> {
                    symbol = " + ";
                    yield a + b;
                }
                case 1 -> {
                    symbol = " - ";
                    yield a - b;
                }
                default -> {
                    symbol = " * ";
                    yield a * b;
                }
            };

            String expression = a + symbol + b;
            Engine.getQuestion(expression, String.valueOf(correctAnswer));
        }
        Engine.finishTheGame();
    }
}
