package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        gameEntryPoint();
    }

    public static void gameEntryPoint() {
        Scanner scanner = new Scanner(System.in);
        int beginning = scanner.nextInt();

        switch (beginning) {
            case 0:
                Cli.setUserName();
                System.exit(0);
            case 1:
                Even.parityCheck();
            case 2:
                Calc.expressionEvaluation();
            case 3:
                GCD.findTheGreatestCommonDivisor();
            case 4:
                Progression.findingANumberInProgression();
            case 5:
                Prime.checkingForAPrimeNumber();
            case 6:
                System.exit(0);
            default:
        }
    }
}
