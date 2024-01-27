package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {

    static final int EXIT = 0;
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GREATEST = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        int beginning = scanner.nextInt();

        switch (beginning) {
            case GREET:
                Engine.startTheGame();
            case EVEN:
                Even.parityCheck();
            case CALC:
                Calc.expressionEvaluation();
            case GREATEST:
                GCD.findTheGreatestCommonDivisor();
            case PROGRESSION:
                Progression.findingANumberInProgression();
            case PRIME:
                Prime.checkingForAPrimeNumber();
            case EXIT:
                System.exit(0);
            default:
        }
    }
}
