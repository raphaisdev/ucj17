package src;

public class OperatorClass {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myResult = myFirstValue + mySecondValue * 100.00d; //multiplication has high priority
        System.out.println(myResult);

        double reminder = myResult % 40.00d;
        System.out.println(reminder);

        boolean isNoReminder = reminder == 0;
        System.out.println(isNoReminder);

        if (!isNoReminder) {
            System.out.println("Rememberer");
        }

        double myFirstValue1 = 20.00d;
        double mySecondValue1 = 80.00d;
        double myResult1 = (myFirstValue1 + mySecondValue1) * 100.00d; //parentesis has high priority
        System.out.println(myResult1);

        double reminder1 = myResult1 % 40.00d;
        System.out.println(reminder1);

        boolean isNoReminder1 = reminder1 == 0;
        System.out.println(isNoReminder1);

        if (!isNoReminder) {
            System.out.println("Rememberer");
        }
    }
}
