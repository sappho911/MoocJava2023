
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            //if input not equals zero numbers = number + 1;
            if (input != 0) {
                numbers++;
            }
        } //end of loop
        System.out.println("Number of numbers: " + numbers);
    }//end of main
}
