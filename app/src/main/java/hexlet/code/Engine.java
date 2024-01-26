package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final int QUESTIONS = 3;

    public static void startTheGame(String question) {
        Cli.setUserName();
        System.out.println(question);
    }

    public static void startTheGame() {
        Cli.setUserName();
        System.exit(0);
    }

    public static int getNumberOfQuestions() {
        return QUESTIONS;
    }

    public static void getQuestion(String expression, String correctAnswer) {
        System.out.print("Question: " + expression + "\nYour answer: ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                    + "'.\nLet's try again, " + Cli.getUserName() + "!");
            System.exit((0));
        }
    }

    public static void finishTheGame() {
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
        System.exit((0));
    }
}
