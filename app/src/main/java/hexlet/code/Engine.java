package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final int QUESTIONS = 3;
    static final int MAX = 20;

    public static int getNumberOfQuestions() {
        return QUESTIONS;
    }

    public static int getMaxNumber() {
        return MAX;
    }

    public static void getQuestion(String question, String[][] questions) {
        Cli.setUserName();
        System.out.println(question);

        for (String[] strings : questions) {
            System.out.print("Question: " + strings[0] + "\nYour answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals(strings[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + strings[1]
                        + "'.\nLet's try again, " + Cli.getUserName() + "!");
                System.exit((0));
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
        System.exit((0));
    }
}
