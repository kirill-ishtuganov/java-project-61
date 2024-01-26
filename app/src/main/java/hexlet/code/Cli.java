package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;

    public static void setUserName() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getUserName() {
        return name;
    }
}
