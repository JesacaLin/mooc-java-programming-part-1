
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create new ArrayList to store the inputs
        //initialize loop
        // implement here a program that reads user input, store in variable
        // until the user enters 9999, break loop
        // store all the other numbers into the ArrayList. 
        ArrayList<Integer> inputList = new ArrayList<>(); 
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            inputList.add(input);
        }
        //declare a variable to store the smallest number
        //iterate through ArrayList, comparing current number to smallest number
        //print smallest number
        int smallestNum = inputList.get(0);
        for (int i = 1; i < inputList.size(); i++) {
            int currentNum = inputList.get(i);
            if (currentNum < smallestNum) {
                smallestNum = currentNum;
            }
        }
        System.out.println("Smallest number: " + smallestNum);
        //iterate another loop, if a value matches smallest number, print the index statement
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) == smallestNum) {
                System.out.println("Found at index: " + i);
            }
        }
        scanner.close();
    }
}
