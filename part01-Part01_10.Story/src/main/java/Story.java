
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print out the two lines of prompt
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        //store user input into a variable
        String name = scanner.nextLine();

        //print out another line of prompt
        System.out.println("What is their job?");

        //store user input into a variable
        String job = scanner.nextLine();

        //print the story with the correct variables in the right places.
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+name+", who was "+job+".");
        System.out.println("On the way to work, "+name+" reflected on life.");
        System.out.println("Perhaps "+name+" will not be "+job+" forever.");
    }
}
