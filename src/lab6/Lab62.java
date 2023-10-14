package lab6;

import java.util.Scanner;

public class Lab62 {
    public static void main(String[] args) {
        String myPassword = "password123";
        System.out.println("Please enter your password:");
        // Initialize inputPassword variable allow user inter from key
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.nextLine();
        // initialize boolean variable for inputting correct password
        boolean isCorrectPassword = inputPassword.equals(myPassword);
        int count = 1;
        // loop allow user inputs wrong password < 3 times
        while (!isCorrectPassword && count < 3) {
            System.out.println("Your password is incorrect.Try again");
            inputPassword = scanner.nextLine();
            count++;


        }
        // if user inputs correct password  => show correct message
        if (inputPassword.equals(myPassword)) {
            isCorrectPassword = true;
            System.out.println("Your password is correct");
            // break;
         //   if user input incorrectly at 3rd, show good bye message
        } else {
            System.out.println("Your password is incorrect.Good bye");
        }

        scanner.close();
    }
}
