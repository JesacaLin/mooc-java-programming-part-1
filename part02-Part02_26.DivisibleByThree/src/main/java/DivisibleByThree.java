
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //call method 
        divisibleByThreeInRange(3, 6);
        scanner.close();
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        //need a loop to iterate from beginning to end
        //conditional - if num is divisible by three, print
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
