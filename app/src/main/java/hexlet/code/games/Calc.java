package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    static final char[] AVAILABLE_OPERATIONS = {'+', '-', '*'};

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.askQuestions("What is the result of the expression?", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int a = Utils.getRandomNumber();
        int b = Utils.getRandomNumber();
        int symbolIndex = Utils.getRandomNumber(0, AVAILABLE_OPERATIONS.length);

        questionAndAnswer[0] = a + " " + AVAILABLE_OPERATIONS[symbolIndex] + " " + b;
        questionAndAnswer[1] = String.valueOf(calculate(a, b, symbolIndex));
        return questionAndAnswer;
    }

    public static int calculate(int a, int b, int symbolIndex) {
        return switch (symbolIndex) {
            case 0 -> a + b;
            case 1 -> a - b;
            case 2 -> a * b;
            default -> throw new RuntimeException("Unexpected value: " + symbolIndex);
        };
    }
}
