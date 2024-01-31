package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    static final int ACTIONS = 3;

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.QUESTIONS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.getQuestion("What is the result of the expression?", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int a = Utils.getRandomNumber();
        int b = Utils.getRandomNumber();
        int c = Utils.getRandomNumber(ACTIONS) - 1;
        String symbol;

        int correctAnswer = switch (c) {
            case 1 -> {
                symbol = " + ";
                yield a + b;
            }
            case 2 -> {
                symbol = " - ";
                yield a - b;
            }
            default -> {
                symbol = " * ";
                yield a * b;
            }
        };
        questionAndAnswer[0] = a + symbol + b;
        questionAndAnswer[1] = String.valueOf(correctAnswer);
        return questionAndAnswer;
    }
}
