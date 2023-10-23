
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //convert the input to integer and store in a variable
       //conditional
        //if num is less than 0
            //print the variable * -1
        //else print the variable
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }
        scanner.close();

    }
}
