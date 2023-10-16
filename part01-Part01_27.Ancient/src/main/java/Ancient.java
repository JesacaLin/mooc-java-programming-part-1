
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //print a prompt to ask the user for an integer
        //convert the integer
        //conditional statement
            //if input is 1983, return the specific print statement

        System.out.println("Give a year: ");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 2015){
            System.out.println("Ancient history!");
        }
        scan.close();
    }
}
