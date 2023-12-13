
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        // print user input prompt, store input in a variable
        // initialize a loop to look for the number
            // check for the variable inside the ArrayList 
            // print result string every time the input was encountered
        System.out.print("Search for? ");
        int input = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == input) {
                System.out.println(input + " is at index " + i);
            }
        }
    }
}
