
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int value : array) {
            for (int j = 0; j < value; j++) {
                System.out.print("*");
            }//end of for loop j
            System.out.println();
        }//end of foreach
    }

}
