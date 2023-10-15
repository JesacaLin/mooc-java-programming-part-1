
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask for user input
        //convert string input to integer
        //set up conditional statement
            //if input is greater than 120, print speeding ticket
        //close scanner

        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed > 120){
            System.out.println("Speeding ticket!");
        }

        scanner.close();
    }
}
