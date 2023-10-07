package lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = 100;
        int[] randomArray = generateRandomArray(arrayLength);

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
                    for (int num : randomArray) {
                        System.out.print(num + " ");
                    }
                    break;
                case 2:
                    int maxNum = Arrays.stream(randomArray).max().getAsInt();
                    System.out.println("Max value is: " + maxNum);
                    break;
                case 3:
                    int minNum = Arrays.stream(randomArray).min().getAsInt();
                    System.out.println(" Min value is: " + minNum);

                    break;
                case 4:
                    // khai bao bien luan ly tim number
                    int userNumber;
                    Scanner scannerSearchNum = new Scanner(System.in);
                    System.out.println("Please enter your number: ");
                    userNumber = scannerSearchNum.nextInt();
                    boolean hasNumber = false;
                    for (int j : randomArray) {
                        if (userNumber == j) {
                            hasNumber = true;
                            break;
                        }
                    }
                    if (hasNumber) {
                        System.out.println("Your number: " + userNumber + " is found in the array");

                    } else {
                        System.out.println("Your number: " + userNumber + " is not found in the array");

                    }
                    break;
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

