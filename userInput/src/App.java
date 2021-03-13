package userInput.src;

import java.util.Scanner; // import scanner for getting user input

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // allows user to enter input into the console

        System.out.println("When were you born?");
        boolean hasNextInt = scanner.hasNextInt(); // checks to see if next input entered is an integer; returns false if not an integer
        System.out.println(hasNextInt); // hasNextInt() not returned until next input is entered

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // nextInt() converts input string to an int
            scanner.nextLine(); // nextInt() doesn't move to next line; call nextLine() to move to next line

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // get user input

            System.out.println("Hello " + name + ".  You are " + (2020 - yearOfBirth) + " years old.");
        } else {
            System.out.println("Invalid year value");
        }

        scanner.close(); // close the scanner to avoid errors
    }
}
