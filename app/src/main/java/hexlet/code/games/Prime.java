package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    static final int EXCEPTION = 4;
    public static void checkingForAPrimeNumber() {
        String[][] questions = new String[Engine.getNumberOfQuestions()][2];

        for (var i = 0; i < questions.length; i++) {
            int number = (int) (Math.random() * Engine.getMaxNumber()) + 2;
            questions[i][0] = String.valueOf(number);
            questions[i][1] = isSimple(number);
        }
        Engine.getQuestion("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questions);
    }

    public static String isSimple(int number) {
        if (number == EXCEPTION) {
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
