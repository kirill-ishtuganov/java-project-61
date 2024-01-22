package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Engine {
    public static void questioning(String expression, String correctAnswer) {

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
}
