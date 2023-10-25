
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialize a while loop
            //print prompt for user input
            //convert string, store in variable
            //conditional
                //if input equals 4, break
        //close scanner
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 4) {
                break;
            }
        }
        scanner.close();
    }
}
