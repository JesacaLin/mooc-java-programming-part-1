
//LOOK--> OPTION 1


// import java.util.Scanner;

// public class PersonalDetails {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         //need a name length variable
//         //longest name variable
//         //sum of birth years variable
//         //counter variable 

//         //initialize a loop
//             //ask for and store input into variable
//             //if empty line is entered, break out of loop
//             //initialize new array - splitting input by comma
//             //initialize inner loop
//                 //variable for current word length;
//                 //if current word length is longest, re-assigned longest word
//                     //also reassign longest name
//                 //with each iteration, add sum to sum variable and increment counter;
//         //print longest name
//         //print average birth year
//         //close scanner 
//         int lengthOfName = 0;
//         String longestName = "";
//         int sum = 0;
//         int counter = 0;

//         while (true) {
//             String userInput = scanner.nextLine();
//             if (userInput.equals("")) break;

//             String[] inputArray = userInput.split(",");
//             for (String name: inputArray) {
//                 int currentWordLength = name.length();
//                 if (currentWordLength > lengthOfName) {
//                     lengthOfName = currentWordLength;
//                     longestName = name;
//                 }
//             }
//             sum += Integer.valueOf(inputArray[1]);
//             counter++;
//         }
//         System.out.println("Longest name: " +longestName);
//         System.out.println("Average of the birth years: " +(1.0 * sum / counter));
//         scanner.close();
//     }
// }


//LOOK --> OPTION 2


import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create 2 ArrayLists to store the name and age
        //initialize loop to ask for input and store it into a variable
            //if empty string, break
            //split input and store in a new array
            //add values into the two arrayLists
        //initialize longestName variable
        //loop to find longest name
        //print longest name
        //initialize sum of birth name variables
        //loop to find sum
        //print average

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> yearList = new ArrayList<>();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) break;
            String[] splitInput = userInput.split(",");
            nameList.add(splitInput[0]);
            yearList.add(Integer.valueOf(splitInput[1]));
        }
    
        String longestName = nameList.get(0);
        for (String name: nameList) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " +longestName);

        int sumOfBirthYears = 0;
        for (Integer year: yearList) {
            sumOfBirthYears += year;
        }
        System.out.println("Average of the birth years: " + (1.0 * sumOfBirthYears / yearList.size()));

        scanner.close();
    }
}
