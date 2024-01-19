package hexlet.code;

import java.io.InputStream;
import java.util.Scanner;

public class Even {
    public static void parityCheck(InputStream args) {

        Cli.getUserName(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        question(15, "no");
        question(6, "yes");
        question(7, "no");

        System.out.println("Congratulations, " + Cli.userName);
        System.exit((0));
    }

    public static void question(int number, String word) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Question: " + number + "\nYour answer: ");

        String answer = scanner.nextLine();

        if (answer.equals(word)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + word
                    + "'.\nLet's try again, " + Cli.userName);
            System.exit((0));
        }
    }

}
