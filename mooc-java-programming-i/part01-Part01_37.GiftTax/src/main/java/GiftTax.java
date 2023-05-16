
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        double input = Double.valueOf(scan.nextLine());

        double taxRateOne = (100 + (input - 5000) * 0.08);
        double taxRateTwo = (1700 + (input - 25000) * 0.10);
        double taxRateThree = (4700 + (input - 55000) * 0.12);
        double taxRateFour = (22100 + (input - 200000) * 0.15);
        double taxRateFive = (142100 + (input - 1000000) * 0.17);

        if (input < 5000) {
            System.out.println("No tax!");
        } else if (input >= 5000 && input < 25000) {
            System.out.println("Tax: " + taxRateOne);
        } else if (input >= 25000 && input < 55000) {
            System.out.println("Tax: " + taxRateTwo);
        } else if (input >= 55000 && input < 200000) {
            System.out.println("Tax: " + taxRateThree);
        } else if (input >= 200000 && input < 1000000) {
            System.out.println("Tax: " + taxRateFour);
        } else if (input >= 1000000) {
            System.out.println("Tax: " + taxRateFive);
        }
    }
}
