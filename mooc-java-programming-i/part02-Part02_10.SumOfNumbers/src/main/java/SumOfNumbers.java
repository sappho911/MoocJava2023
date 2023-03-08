
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            //sum = summa + input;
            sum += input;
        }//end of loop
        System.out.println("Sum of the numbers: " + sum);
    }//end of main
}
