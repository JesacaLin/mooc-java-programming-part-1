
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //print prompt for user input
        //store input into a string variable
        //conditional
            //compare the variable to Caput Draconis
            //print final result

        System.out.println("Password? ");
        String password = scan.nextLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome! ");
        } else {
            System.out.println("Off with you! ");
        }
        scan.close();
    }
}
