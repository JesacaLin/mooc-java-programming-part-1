
public class StarSign {

    public static void main(String[] args) {
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        //initialize loop to print stars, start at 1 and end at number
        //once loop ends, print line break
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        //initialize loop to keep calling printStars the amount of times is required
            //printing whatever the parameter is.
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        //height is how many times the loop needs to run.
        //width is how many stars on each line
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        //size is how many times the loop should run, start with 1 because starting at 0 doesn't make sense.
        //at each iteration, print i number of stars.
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
