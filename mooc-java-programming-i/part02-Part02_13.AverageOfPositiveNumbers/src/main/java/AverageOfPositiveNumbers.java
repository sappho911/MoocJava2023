
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int sum = 0;

        while (true) {
            System.out.println("add number");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            if (input > 0) {
                positives++;
                sum += input;
            }

        }//end of loop
        if (positives == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(1.0 * sum / positives);
    }//end of main
}
