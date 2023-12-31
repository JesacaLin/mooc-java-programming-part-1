
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        //declare a sum variable
        //iterate through ArrayList and add to sum variable with each iteration
        //print final string
        //close scanner
        int sum = 0;
        for (Integer num: list) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
