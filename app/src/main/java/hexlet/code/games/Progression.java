package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static void findingANumberInProgression() {

        Engine.startTheGame("What number is missing in the progression?");

        for (var i = 0; i < 3; i++) {
            Random r = new Random();
            int lengthOfPr = r.nextInt(5, 10);
            int firstNumberInPr = r.nextInt(1, 20);
            int step = r.nextInt(2, 8);
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
