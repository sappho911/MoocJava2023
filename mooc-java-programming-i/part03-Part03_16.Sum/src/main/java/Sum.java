
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }//end of main

    public static int sum(ArrayList<Integer> numbers) {
        int summa = 0;
        for (int number : numbers) {
            summa += number;
        }
        return summa;
    }//end of method sum
}//end of class
