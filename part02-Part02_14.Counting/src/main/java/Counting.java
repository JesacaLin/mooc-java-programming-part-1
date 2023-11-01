
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //request input from user
        //initialize loop - 0 up to input
            //print number
        //close scanner
        int input = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= input; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
