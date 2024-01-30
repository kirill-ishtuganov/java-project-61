package hexlet.code.games;

import hexlet.code.Engine;
import java.util.StringJoiner;

public class Progression {

    // size of progression
    static final int LENGTH = 5;
    // min size of progression;
    static  final  int MIN = 5;
    // max size step;
    static final int STEP = 6;
    public static void findingANumberInProgression() {
        String[][] questions = new String[Engine.getNumberOfQuestions()][2];

        for (var i = 0; i < questions.length; i++) {
            int lengthOfPr = (int) (Math.random() * LENGTH) + MIN;
            int firstNumberInPr = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            int step = (int) (Math.random() * STEP) + 2;
            int missingIndex = (int) (Math.random() * lengthOfPr);
            questions[i][0] = getProgression(lengthOfPr, firstNumberInPr, step, missingIndex);
            questions[i][1] = String.valueOf(firstNumberInPr + (step * (missingIndex + 1)));
        }
        Engine.getQuestion("What number is missing in the progression?", questions);
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
