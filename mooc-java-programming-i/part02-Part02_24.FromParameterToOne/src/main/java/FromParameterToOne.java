
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {

        while (number >= 1) {
            System.out.println(number);
            number -= 1;
        }//end of while loop
    }//end of printFromNumberToOne method

}// end of class FromParameterToOne
