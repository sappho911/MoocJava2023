
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameOfOldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] person = input.split(",");
            int age = Integer.valueOf(person[1]);

            if (age > nameOfOldest) {
                nameOfOldest = age;
            }
        }//end while

        System.out.println("Age of the oldest: " + nameOfOldest);
    }
}
