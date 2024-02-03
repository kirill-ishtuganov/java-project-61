package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.askQuestions("Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int number = Utils.getRandomNumber();
        questionAndAnswer[0] = String.valueOf(number);
        questionAndAnswer[1] = parityCheck(number) ? "yes" : "no";
        return questionAndAnswer;
    }

    public static boolean parityCheck(int number) {
        return (number % 2) == 0;
    }
}
