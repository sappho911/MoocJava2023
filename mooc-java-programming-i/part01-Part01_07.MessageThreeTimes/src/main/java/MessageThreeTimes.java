
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create the tool for reading, assign it to variable caller "scanner
        System.out.println("Write a message:");
        // Write your program here

        //Read the user's string input, save it to program memory
        //"String message = (user input)"
        String message = scanner.nextLine();

        //Message Three Times user input
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

    }
}
