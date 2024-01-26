package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void expressionEvaluation() {
        Engine.startTheGame("What is the result of the expression?");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            var maxNumber = 20;
            var numberOfMathActions = 3;

            int a = (int) (Math.random() * maxNumber) + 1;
            int b = (int) (Math.random() * maxNumber) + 1;
            int c = (int) (Math.random() * numberOfMathActions);
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
