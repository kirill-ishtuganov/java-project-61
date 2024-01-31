package hexlet.code;

public class Utils {

    public static final int MAX = 20;

    public static int getRandomNumber() {
        return (int) (Math.random() * MAX) + 1;
    }

    public static int getRandomNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
