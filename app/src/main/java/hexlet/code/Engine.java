package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static Cli user = new Cli("", 3);
    public static void startTheGame(String question) {

        user.setUserName();
        System.out.println(question);
    }

    public static int getNumberOfQuestions() {
        int numberOfQuestions = 3;
        return numberOfQuestions;
    }
    public static void startTheGame() {
        user.setUserName();
        System.exit(0);
    }

    public static void getQuestion(String expression, String correctAnswer) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Question: " + expression + "\nYour answer: ");

        String answer = scanner.nextLine();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                    + "'.\nLet's try again, " + user.getUserName() + "!");
            System.exit((0));
        }
    }

    public static void finishTheGame() {
        System.out.println("Congratulations, " + user.getUserName() + "!");
        System.exit((0));
    }
}
