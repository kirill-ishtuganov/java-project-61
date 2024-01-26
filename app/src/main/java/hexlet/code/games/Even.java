package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void parityCheck() {

        Engine.startTheGame("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            Random r = new Random();
            int number = r.nextInt(20);
            String correctAnswer = (number % 2) == 0 ? "yes" : "no";
            Engine.getQuestion(String.valueOf(number), correctAnswer);
        }
        Engine.finishTheGame();
    }
}
