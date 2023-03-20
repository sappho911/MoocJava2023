
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Enter the numbers");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }//end of while loop

        System.out.println("From where?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.valueOf(scanner.nextLine());

        int i = start;

        while (start <= end) {
            int result = numbers.get(start);
            System.out.println(result);
            start++;
        }

    }//end of main
}//end of class
