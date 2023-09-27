package lab33;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] myIntArray = {12, 34, 1, 16, 28};
        for (int j = 0; j < myIntArray.length ; j++)
        {
        for (int i = 0; i < myIntArray.length -1 ; i++) {
            if (myIntArray[i] > myIntArray[i + 1]) {
                int tempValue = myIntArray[i];
                myIntArray[i]= myIntArray[i + 1];
                myIntArray[i+1] = tempValue;
            }
        }
        }

        System.out.println("My Sort Array:" + Arrays.toString(myIntArray));

    }
}
