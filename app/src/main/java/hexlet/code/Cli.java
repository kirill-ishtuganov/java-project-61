package hexlet.code;

import java.io.InputStream;
import java.util.Scanner;
public class Cli {
    public static void getUserName(InputStream args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName);
    }
}
