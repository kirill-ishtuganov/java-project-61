package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n"
                + "5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        int beginning = scanner.nextInt();
        switch (beginning) {
            case 1:
                Engine.startTheGame();
            case 2:
                Even.parityCheck();
            case 3:
                Calc.expressionEvaluation();
            case 4:
                GCD.findTheGreatestCommonDivisor();
            case 5:
                Progression.findingANumberInProgression();
            case 6:
                Prime.checkingForAPrimeNumber();
            default:
        }
    }
}
