package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {

    static final int LENGTH = 5;
    // first number = 5;
    static  final  int FIRST = 5;
    // max size step = 6;
    static final int STEP = 6;
    public static void findingANumberInProgression() {
        Engine.startTheGame("What number is missing in the progression?");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            int lengthOfPr = (int) (Math.random() * LENGTH) + FIRST;
            int firstNumberInPr = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int step = (int) (Math.random() * STEP) + 2;
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
