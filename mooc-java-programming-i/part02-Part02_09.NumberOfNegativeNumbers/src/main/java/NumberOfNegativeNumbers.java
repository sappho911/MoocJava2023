
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            //if input less than zero, negatives = negatives + 1;
            if (input < 0) {
                negatives++;
            }
        }//end of loop
        System.out.println("Number of negative numbers: " + negatives);
    }//end of main
}
