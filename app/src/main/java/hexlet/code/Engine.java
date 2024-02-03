package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;

    public static void askQuestions(String rules, String[][] questionsAndAnswers) {
        String userName = Cli.greet();
        System.out.println(rules);

        for (String[] task : questionsAndAnswers) {
            System.out.print("Question: " + task[0] + "\nYour answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals(task[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + task[1]
                        + "'.\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
