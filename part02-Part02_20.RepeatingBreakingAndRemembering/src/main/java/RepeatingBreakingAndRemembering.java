
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += input;
            counter++;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);

        if (sum > 0) {
            double average = 1.0 * sum /counter;
            System.out.println("Average: " + average);
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
