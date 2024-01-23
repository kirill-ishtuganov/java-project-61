package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "0 - Exit\n"
                + "Your choice: ");
        int beginning = scanner.nextInt();
        switch (beginning) {
            case 1:
                Cli.getUserName();
                System.exit(0);
            case 2:
                Even.parityCheck();
            case 3:
                Calc.expressionEvaluation();
            case 4:
                GCD.findTheGreatestCommonDivisor();
            default:
        }
    }
}
