
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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
        //implement finding the greatest number in the list here
        //need variable to store largest integer
        //initialize loop to compare numbers in the ArrayList
            //variable to store current number
            //compare current number to next number
            //update largest integer
        //print final statement
        int largestNum = 0;
        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i);
            if (currentNum > largestNum) {
                largestNum = currentNum;
            }
        }
        System.out.println("The greatest number: " + largestNum);
    }
}
