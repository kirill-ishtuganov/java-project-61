package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Progression {

    static final int MAX_PROGRESSION_SIZE = 10;
    static  final  int MIN_PROGRESSION_SIZE = 5;
    static final int MAX_PROGRESSION_STEP = 6;
    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.askQuestions("What number is missing in the progression?", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];

        int prLength = Utils.getRandomNumber(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE);
        int firstNumber = Utils.getRandomNumber();
        int step = Utils.getRandomNumber(MAX_PROGRESSION_STEP);
        int missingIndex = Utils.getRandomNumber(prLength - 1);
        String[] progression = generateProgression(prLength, firstNumber, step);

        questionAndAnswer[1] = progression[missingIndex];
        questionAndAnswer[0] = getProgressionWithMissingNumber(progression, missingIndex);
        return questionAndAnswer;
    }

    public static String[] generateProgression(int prLength, int firstNumber, int step) {
        String[] progression = new String[prLength];
        progression[0] = String.valueOf(firstNumber);
        int currentNumber = firstNumber;

        for (var i = 1; i < prLength; i++) {
            currentNumber += step;
            progression[i] = String.valueOf(currentNumber);
        }
        return progression;
    }

    public static String getProgressionWithMissingNumber(String[] progression, int missingIndex) {
        progression[missingIndex] = "..";
        List<String> strings = new LinkedList<>();
        Collections.addAll(strings, progression);
        return String.join(" ", strings);
    }
}
