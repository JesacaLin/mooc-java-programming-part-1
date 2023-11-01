
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //sum and counter variable
        //start the loop
        //initialize variable to store input, convert
        //conditional
            //if input is 0 AND positive number is 0 - Cannot calculate the average
            //if input is 0 - break
            //if input is more than 0 - add it to the sum AND and increase counter - continue
            //if input is negative - nothing happens, continue the look
        //print average
        //close scanner

        int sum = 0;
        int counter = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0 && sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } 
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum += input;
                counter += 1;
                continue;
            }
            continue;
        }
        if (sum > 0) {
            System.out.println(1.0 * sum / counter);
        }
        scanner.close();
    }
}
