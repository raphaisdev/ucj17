package src.section5;

public class IfThenClass {
    public static void main(String[] args) {
        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("Not Alien!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("High Score");
        }

        int midScore = 50;
        if (midScore > 20 && midScore <= 50) {
            System.out.println("Mid Score");
        }


        int lowScore = 10;
        if (topScore >= 0 && lowScore <= 20) {
            System.out.println("Low Score");
        }

        if (topScore >= 50 || lowScore <= 50) {
            System.out.println("Top Score higher or equal 50 or lower score is lower or equal 50");
        }

        String carBrand = "Wolks";
        boolean isDomestic = carBrand == "Wolks" ? true : false;
        boolean isDomesticSimplier = carBrand == "Wolks";

        System.out.println(isDomestic && isDomesticSimplier);

    }
}
