
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        //size indicates the number of rows
        //variables to keep count: spaces and stars
        int spaces = size - 1;
        int stars = 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(spaces);
            spaces--;
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        //two parts, the triangle and the stump
        int spaces = height - 1;
        int stars = 0;
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            spaces--;
            printStars(stars + i);
            stars++;
        }

        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
