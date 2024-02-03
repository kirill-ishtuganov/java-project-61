package hexlet.code;

public class Utils {

    public static final int MAX = 20;

    public static int getRandomNumber() {
        return getRandomNumber(1, MAX);
    }

    public static int getRandomNumber(int max) {
        return getRandomNumber(1, max);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
