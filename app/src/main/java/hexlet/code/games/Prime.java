package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void checkingForAPrimeNumber() {

        Engine.startTheGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            Random r = new Random();
            int minNumber = 3;
            int maxNumberMinusOne = 72;
            int number = r.nextInt(minNumber, maxNumberMinusOne);
            Engine.getQuestion(String.valueOf(number), isSimple(number));
        }
        Engine.finishTheGame();
    }

    public static String isSimple(Integer number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
