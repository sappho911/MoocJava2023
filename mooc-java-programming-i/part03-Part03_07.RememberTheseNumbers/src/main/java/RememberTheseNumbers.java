
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Enter the number");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
            System.out.println("You entered " + number);
        }//end of while loop

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }//end of loop
    }//end of main
}//end of class RememberTheseNumbers
