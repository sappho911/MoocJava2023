
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from = Integer.valueOf(scanner.nextLine());

        int to = 100;

        while (from <= to) {
            System.out.println(from);
            from++;
        }//end of while loop        
    }//end of main
}//end of class
