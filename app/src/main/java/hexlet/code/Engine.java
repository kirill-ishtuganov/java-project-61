package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startTheGame(String question) {

        Cli.getUserName();
        System.out.println(question);
    }

    public static void getQuestion(String expression, String correctAnswer) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Question: " + expression + "\nYour answer: ");

        String answer = scanner.nextLine();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                    + "'.\nLet's try again, " + Cli.userName + "!");
            System.exit((0));
        }
    }

    public static void finishTheGame() {
        System.out.println("Congratulations, " + Cli.userName + "!");
        System.exit((0));
    }
}
