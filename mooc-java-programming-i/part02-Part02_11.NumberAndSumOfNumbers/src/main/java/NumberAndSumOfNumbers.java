
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
            //if input not equal zero , amount +1;
            if (input != 0) {
                amount++;
            }
            //sum  = sum + input;
            sum += input;
        }//end of loop
        System.out.println("Number of numbers: " + amount);
        System.out.println("Sum of the numbers: " + sum);
    }//end of main
}
