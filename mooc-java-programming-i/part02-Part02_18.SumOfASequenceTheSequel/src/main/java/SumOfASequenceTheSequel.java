
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        int summa = 0;
        
        while (firstNumber <= lastNumber) {
            summa += firstNumber;
            firstNumber ++;
        }
        System.out.println("The sum is " + summa);
    }
}
