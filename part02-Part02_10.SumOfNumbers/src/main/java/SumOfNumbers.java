
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            sum += input;
        }

        System.out.println("Sum of the numbers: "+sum);

        scanner.close();
    }
}
