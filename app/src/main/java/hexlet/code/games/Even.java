package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void parityCheck() {
        Engine.startTheGame("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < Engine.getNumberOfQuestions(); i++) {
            int number = (int) (Math.random() * 100) + 1;
            String correctAnswer = (number % 2) == 0 ? "yes" : "no";
            Engine.getQuestion(String.valueOf(number), correctAnswer);
        }
        Engine.finishTheGame();
    }
}
