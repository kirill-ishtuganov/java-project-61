package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit\nYour choice:");
        int beginning = scanner.nextInt();
        if(beginning == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getUserName(System.in);
        } else if(beginning == 0) {
            System. exit(0);
        }
    }
}
