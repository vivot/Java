package lab21;

import java.util.Scanner;

public class MBI {

    public static void main(String[] args) {
        // Initial variable for high and weigh
        // My BMI = wight/ (high x high)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Weight");
        float myWeigh = scanner.nextFloat();
        System.out.println("Please enter your High");
        float myHigh = scanner.nextFloat();
        // My BMI = weight/ (high x high)
        float myBMI = myWeigh / (myHigh * myHigh);
        // Return BMI value
        if (myBMI < 18.5) {
            System.out.println("Your BMI:=" + myBMI + " is consider as Underweight");
            System.out.println("You should increase your weight ");
        }
           else if (myBMI <= 24.9) {
                System.out.println("Your BMI:=" + myBMI + " is Normal weight");
            System.out.println("You did great job. Keep in sharp");
            }
           else if (myBMI <= 29.9) {
                System.out.println("Your BMI:=" + myBMI + " is Overweight");
            System.out.println("You should consider to have a diet");

        } else {
                System.out.println("Your BMI:=" + myBMI + " is Obesity");
            System.out.println("You need to consult a healthcare professional to have a properly diet");
            }

    }
}