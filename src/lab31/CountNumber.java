package lab31;

public class CountNumber {
    public static void main(String[] args) {
        int[] myIntArr = {1, 2, 3, 4, 5};
        // khai bao bien count even number
        // khai bao bien count odd number
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < myIntArr.length; i++)
        {
            if ((myIntArr[i] % 2) == 0)
                countEven = countEven+1;
            else {
                countOdd = countOdd+1;
            }
        }
        System.out.printf("Even Numbers: %d\n", countEven);
        System.out.printf("Odd Numbers: %d\n", countOdd);
    }
}
