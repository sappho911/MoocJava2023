
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? (finish)");

        int to = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? (start)");

        int from = Integer.valueOf(scanner.nextLine());

        while (from <= to) {
            System.out.println(from);
            from++;
        }//end of while  
    }//end of main
}//end of class
