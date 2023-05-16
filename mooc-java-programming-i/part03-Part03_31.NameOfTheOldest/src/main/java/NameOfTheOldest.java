
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            System.out.println("Enter the name and age [Name,age]");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }//end of if

            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
                name = parts[0];

            }//end of if
        }//end of while
        System.out.println("Name of the oldest: " + name);
    }
}
