package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (var i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.askQuestions("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int number = Utils.getRandomNumber() + 1;
        questionAndAnswer[0] = String.valueOf(number);
        questionAndAnswer[1] = isPrime(number) ? "yes" : "no";
        return questionAndAnswer;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
