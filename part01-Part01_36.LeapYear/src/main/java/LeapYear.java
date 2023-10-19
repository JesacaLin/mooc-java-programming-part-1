
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //print prompt to request user input
        //store input into int variable
        //conditional
            //1. if divisible by 100 AND 400
            //2. else if it is divsible by 4
            //print appropriate resutl
        //close scan
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else if ((year % 100 == 0) && !(year % 400 == 0)) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
        scan.close();
    }
}
