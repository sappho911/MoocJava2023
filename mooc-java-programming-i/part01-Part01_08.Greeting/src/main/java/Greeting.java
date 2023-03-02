
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name? ");

        //string name and user input
        String name = scanner.nextLine();
        //printing hi + user input (name)
        System.out.println("Hi " + name);
    }
}
