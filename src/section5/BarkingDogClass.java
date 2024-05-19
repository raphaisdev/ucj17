package src.section5;

public class BarkingDogClass {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (hourOfDay >= 0 && hourOfDay <= 23) && (barking && (hourOfDay < 8 || hourOfDay > 22));
    }
}
