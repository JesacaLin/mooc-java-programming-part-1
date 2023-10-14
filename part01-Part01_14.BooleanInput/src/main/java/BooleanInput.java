
//import java.util.Scanner;

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print a prompt to ask for user input;
        System.out.println("Write something: ");

        //convert input to boolean value;
        //store the value in a boolean variable;
        boolean value = Boolean.valueOf(scanner.nextLine());

        //print the final line with variable;
        System.out.println("True or false? "+value);
        

    }
}
