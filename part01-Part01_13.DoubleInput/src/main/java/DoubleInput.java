
//import java.util.Scanner;
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print a line to ask user for floating point number;
        System.out.println("Give a number: ");
        //convert the user input to correct data type;
        //store converted user input into a variable;
        double value = Double.valueOf(scanner.nextLine());


        //print the final result;
        System.out.println("You gave the number "+value);

    }
}
