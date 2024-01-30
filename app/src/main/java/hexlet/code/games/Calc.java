package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {

    static final int ACTIONS = 3;
    public static void expressionEvaluation() {
        String[][] questions = new String[Engine.getNumberOfQuestions()][2];

        for (var i = 0; i < questions.length; i++) {
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
            questions[i][0] = a + symbol + b;
            questions[i][1] = String.valueOf(correctAnswer);
        }
        Engine.getQuestion("What is the result of the expression?", questions);
    }
}
