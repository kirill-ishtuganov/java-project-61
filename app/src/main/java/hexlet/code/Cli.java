package hexlet.code;

import java.util.Scanner;

public class Cli {

    private String name;

    Cli(String name, int numberOfQuestions) {
        this.name = name;
    }

    public void setUserName() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        this.name = scanner.nextLine();
        System.out.println("Hello, " + this.name + "!");
    }

    public String getUserName() {
        return this.name;
    }
}
