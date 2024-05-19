package src.section5;

public class PositiveNegativeZeroClass {
    public static void checkNumber(int number) {
        if(number < 0) {
            System.out.println("negative");
        } else if(number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }

    public static void ternaryCheckNumber(int number) {
        String result = (number < 0) ? "negative" : (number > 0) ? "positive" : "zero";
        System.out.println(result);
    }
}
