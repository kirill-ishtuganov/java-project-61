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
        questionAndAnswer[1] = String.valueOf(calculate(a, b, AVAILABLE_OPERATIONS[symbolIndex]));
        return questionAndAnswer;
    }

    public static int calculate(int a, int b, char symbol) {
        return switch (symbol) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new RuntimeException("Unexpected value: " + symbol);
        };
    }
}
