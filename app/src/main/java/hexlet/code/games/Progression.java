package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {
    public static void findingANumberInProgression() {
        Engine.startTheGame("What number is missing in the progression?");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            var length = 5;
            var minLength = 5;
            int lengthOfPr = (int) (Math.random() * length) + minLength;

            var maxNumber = 20;
            int firstNumberInPr = (int) (Math.random() * maxNumber) + 1;

            var stepSize = 6;
            int step = (int) (Math.random() * 6) + 2;

            int missingIndex = (int) (Math.random() * lengthOfPr);
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
