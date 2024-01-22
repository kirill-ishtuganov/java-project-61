package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n"
                + "Your choice: ");
        int beginning = scanner.nextInt();
        switch (beginning) {
            case 1:
                Cli.getUserName();
                System.exit(0);
            case 2:
                Even.parityCheck();
                System.exit(0);
            case 3:
                Calc.expressionEvaluation();
                System.exit(0);
            default:
                System.exit(0);
        }
    }
}
