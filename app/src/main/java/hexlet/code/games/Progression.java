package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.QUESTIONS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.getQuestion("What number is missing in the progression?", questionsAndAnswers);
    }

    // max size of progression
    static final int MAX = 10;
    // min size of progression;
    static  final  int MIN = 5;
    // max size step;
    static final int STEP = 6;
    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int prLength = Utils.getRandomNumber(MIN, MAX);
        int firstNumber = Utils.getRandomNumber();
        int step = Utils.getRandomNumber(STEP);
        int missingIndex = Utils.getRandomNumber(prLength - 1);

        questionAndAnswer[0] = getProgression(prLength, firstNumber, step, missingIndex);
        questionAndAnswer[1] = String.valueOf(firstNumber + (step * (missingIndex + 1)));
        return questionAndAnswer;
    }

    public static String getProgression(int prLength, int firstNumber, int step, int missingIndex) {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(String.valueOf(firstNumber));
        int currentNumber = firstNumber;

        for (var i = 0; i < prLength; i++) {
            if (i != missingIndex) {
                currentNumber += step;
                joiner.add(String.valueOf(currentNumber));
            } else {
                currentNumber += step;
                joiner.add("..");
            }
        }
        return joiner.toString();
    }
}
