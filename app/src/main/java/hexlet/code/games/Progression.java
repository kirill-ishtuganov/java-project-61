package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static void findingANumberInProgression() {

        Engine.startTheGame("What number is missing in the progression?");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            Random r = new Random();
            int minLength = 5;
            int maxLength = 10;
            int lengthOfPr = r.nextInt(minLength, maxLength);
            int minNumber = 1;
            int maxNumberMinusOne = 20;
            int firstNumberInPr = r.nextInt(minNumber, maxNumberMinusOne);
            int minStepSize = 2;
            int maxStepSizeMinusOne = 8;
            int step = r.nextInt(minStepSize, maxStepSizeMinusOne);
            int missingIndex = r.nextInt(lengthOfPr);
            String expression = getProgression(lengthOfPr, firstNumberInPr, step, missingIndex);
            int correctAnswer = firstNumberInPr + (step * (missingIndex + 1));
            Engine.getQuestion(expression, String.valueOf(correctAnswer));
        }
        Engine.finishTheGame();
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
