
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declare a variable to hold number of asks
        //initialize a loop
            //prompt the user for input
            //store input into a variable and convert
            //if zero, exit loop and print ask variable, do not update the ask variable
            //if no zero, update ask variable

        int answers = 0;

        while (true) {

            System.out.println("Give a number: ");

            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }

            answers += 1;

        }        
        System.out.println("Number of numbers: "+answers);

        scanner.close();
    }
}
