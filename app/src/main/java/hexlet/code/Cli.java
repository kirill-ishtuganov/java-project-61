package hexlet.code;

import java.io.InputStream;
import java.util.Scanner;

public class Cli {
    public static String userName;

    public static void getUserName(InputStream args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
