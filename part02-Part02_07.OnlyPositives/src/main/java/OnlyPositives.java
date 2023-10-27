
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialize a loop
        //ask user for input
        //convert the input into an integer and store in variable
            //set conditional
                //if num is negative (smaller than zero), 
                    //print "unsuitable number"
                    //continue the loop, resetting the loop
                //if the number is zero
                    //exit loop
                //if num is positive
                    //print num to power of two
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println(num * num);
        }
        scanner.close();
    }
}
