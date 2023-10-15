
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //print a prompt to ask the user for an integer
        //convert the integer
        //conditional statement
            //if input is 1983, return the specific print statement

        System.out.println("Give a number: ");
        int num = Integer.valueOf(scan.nextLine());
        if (num == 1984){
            System.out.println("Orwell");
        }
        scan.close();
    }
}
