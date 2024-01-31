package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {

    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GREATEST = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
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
        Scanner scanner = new Scanner(System.in);
        int beginning = scanner.nextInt();

        switch (beginning) {
            case 0:
                return;
            case 1:
                Cli.greet();
                return;
            case EVEN:
                Even.start();
                return;
            case CALC:
                Calc.start();
                return;
            case GREATEST:
                GCD.start();
                return;
            case PROGRESSION:
                Progression.start();
                return;
            case PRIME:
                Prime.start();
                return;
            default:
        }
    }
}
