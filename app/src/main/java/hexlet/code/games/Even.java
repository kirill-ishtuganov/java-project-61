package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.QUESTIONS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.getQuestion("Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int number = Utils.getRandomNumber();
        questionAndAnswer[0] = String.valueOf(number);
        questionAndAnswer[1] = parityCheck(number);
        return questionAndAnswer;
    }

    public static String parityCheck(int number) {
        return (number % 2) == 0 ? "yes" : "no";
    }
}
