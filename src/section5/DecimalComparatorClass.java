package src.section5;

public class DecimalComparatorClass {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }
}
