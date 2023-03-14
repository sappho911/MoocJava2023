
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");

        int summa = 0;

        int count = 0;

        int input = Integer.valueOf(scanner.nextLine());

        for (int i = count; count <= input; count++) {
            summa += count;
        }

        /*while (count <= input) {
            summa += count;
            count++;
        }*/
        System.out.println("The sum is " + summa);

    }//end of main
}//end of class
