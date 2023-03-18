
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int countPrinted = 0;

        while (countPrinted < number) {
            System.out.print("*");
            countPrinted++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int countSpaces = 0;
        while (countSpaces < number) {
            System.out.print(" ");
            countSpaces++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int countPrinted = 1;
        while (countPrinted <= size) {
            printSpaces(size - countPrinted);
            printStars(countPrinted);
            countPrinted++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i - 1));
            i++;
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
