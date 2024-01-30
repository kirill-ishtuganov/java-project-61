package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void parityCheck() {
        String[][] questions = new String[Engine.getNumberOfQuestions()][2];

        for (var i = 0; i < questions.length; i++) {
            var number = (int) (Math.random() * Engine.getMaxNumber()) + 1;
            String correctAnswer = (number % 2) == 0 ? "yes" : "no";
            questions[i][0] = String.valueOf(number);
            questions[i][1] = correctAnswer;
        }
        Engine.getQuestion("Answer 'yes' if the number is even, otherwise answer 'no'.", questions);
    }
}
