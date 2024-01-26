package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void parityCheck() {

        Engine.startTheGame("Answer 'yes' if the number is even, otherwise answer 'no'.");


        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            Random r = new Random();
            int maxNumber = 20;
            int number = r.nextInt(maxNumber);
            String correctAnswer = (number % 2) == 0 ? "yes" : "no";
            Engine.getQuestion(String.valueOf(number), correctAnswer);
        }
        Engine.finishTheGame();
    }
}
