package lab34;

import java.util.Arrays;

public class MergeArray2 {
    public static void main(String[] args) {
        int[] myArray1 = {1, 12, 16, 28, 34};
        int[] myArray2 = {1, 13, 16, 27, 99};
        int totalLength = myArray1.length + myArray2.length;
        int[] myMergeArray = new int[totalLength];
        // Copy all array 1 to merge array
        System.arraycopy(myArray1, 0, myMergeArray, 0, myArray1.length);
        // Copy all array 2 to merge array, start from array 1

        System.arraycopy(myArray2, 0, myMergeArray, myArray1.length, myArray2.length);
        Arrays.sort(myMergeArray);

        System.out.println("My Sort Array:" + Arrays.toString(myMergeArray));
    }
}
