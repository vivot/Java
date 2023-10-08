package lab4;

import java.util.*;

public class SimpleMenu {
    public static void main(String[] args) {
        // initial scanner variable allow user to input
        Scanner scanner = new Scanner(System.in);
        final int listLength = 100;
        // create randomArray with get value from generateRandomArray method
        int[] randomArray = generateRandomArray(listLength);
        // initial new integer list
        List<Integer> myList = new ArrayList<>();
        // add random array in list
        for (int num : randomArray) {
            myList.add(num);
        }
        // loop game menu allow user choose 4 options
        while (true) {
            System.out.println("=====MENU======\n");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Search number");


            System.out.println("4. Please choose your option (1:4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Print the generated array
                    for (int num : myList) {
                        System.out.print(num + " ");
                    }
                    break;
                case 2:
                    int maxNum = Collections.max(myList);
                    System.out.println("Max value is: " + maxNum);
                    break;
                case 3:
                    int minNum = Collections.min(myList);
                    System.out.println(" Min value is: " + minNum);

                    break;
                case 4:
                    int userNumber;
                    Scanner scannerSearchNum = new Scanner(System.in);
                    System.out.println("Please enter your number: ");
                    userNumber = scannerSearchNum.nextInt();
                    // use contains to search a number user input
                    if (myList.contains(userNumber))

                        System.out.println("Your number: " + userNumber + " is found in the array");
                        else
                    {
                        System.out.println("Your number: " + userNumber + " is not found in the array");

                    }
                         /* Comment the old code with tedious style
                    boolean hasNumber = false;
                    for (int j : myList) {
                        if (userNumber == j) {
                            hasNumber = true;
                            break;
                    if (hasNumber) {
                        System.out.println("Your number: " + userNumber + " is found in the array");

                    } else {
                        System.out.println("Your number: " + userNumber + " is not found in the array");

                    }*/

                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close(); // Close the scanner before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please choose 1-4");

            }


        }


    }

    // generate Array with random number
    public static int[] generateRandomArray(int length) {
        Random randomNum = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = randomNum.nextInt(1000);
        }
        return randomArray;

    }
}

