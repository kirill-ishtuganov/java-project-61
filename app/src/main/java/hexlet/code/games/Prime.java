package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void checkingForAPrimeNumber() {

        Engine.startTheGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            int number = (int) (Math.random() * 30) + 2;
            Engine.getQuestion(String.valueOf(number), isSimple(number));
        }
        Engine.finishTheGame();
    }

    public static String isSimple(int number) {
        if (number == 2 || number == 4) {
            return "no";
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
