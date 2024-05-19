package src;

public class OverloadMethodChallengeClass {
    public static void main(String[] args) {
        System.out.println("Converted 5f 8in = " + convertInchesToCentimeters(5, 8) + " Centimeters");
    }

    public static double convertInchesToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertInchesToCentimeters(int feet, int inches) {
        return convertInchesToCentimeters((feet * 12) + inches);
    }
}
