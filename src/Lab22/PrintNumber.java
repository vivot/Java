package Lab22;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        /* 1. Ini variable from keyboard
        2. If possible, validate input is number ( skip that step on my code)
        3. Even number: %2=0, Odd number%2 !=0
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Input Your Number: ");
        int myNumber = scanner.nextInt();
        if (myNumber % 2 == 0) {
            System.out.printf("The number %d is Even Number: ", myNumber);
        } else {
            System.out.printf("The number %d is Odd Number: ", myNumber);
        }
    }
}
