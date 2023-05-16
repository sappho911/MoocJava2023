
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            //if input not equals zero , then amount +1 and sum + input(number);
            if (input != 0) {
                amount++;
                sum += input;
            }
        }//end of loop
        System.out.println("Average of the numbers: " + 1.0 * sum / amount);
    }//end of main
}
