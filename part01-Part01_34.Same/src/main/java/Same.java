
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //print two prompts for user input
        //store the inputs as string variables
        //conditional
        System.out.println("Enter the first string: ");
        String input1 = scan.nextLine();
        System.out.println("Enter the second string: ");
        String input2 = scan.nextLine();

        if (input1.equals(input2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        scan.close();
    }
}
