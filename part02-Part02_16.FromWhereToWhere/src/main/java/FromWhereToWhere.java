
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int numEnd = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int numStart = Integer.valueOf(scanner.nextLine());
        
        while (numStart <= numEnd) {
            System.out.println(numStart);
            numStart++;
        }
        scanner.close();
    }
}
