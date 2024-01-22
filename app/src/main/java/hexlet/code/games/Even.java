package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Random;

public class Even {
    public static void parityCheck() {

        Cli.getUserName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random r = new Random();
        String correctAnswer;

        for (var i = 0; i < 3; i++) {
            int number = r.nextInt(20);
            correctAnswer = (number % 2) == 0 ? "yes" : "no";
            Engine.questioning(String.valueOf(number), correctAnswer);
        }

        System.out.println("Congratulations, " + Cli.userName + "!");
        System.exit((0));
    }
}
