package lab34;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] myArray1 = {1, 12, 16, 28, 34};
        int[] myArray2 = {1, 13, 16, 27, 99};
        // initial new mergeArray with length = total 2 array
        int totalLength = myArray1.length + myArray2.length;
        int[] myMergeArray = new int[totalLength];
        // copy Array 1 to Merge array
        for (int m = 0; m < myArray1.length; m++) {
            for (int i = 0; i < myArray1.length; i++) {
                int temValue = myArray1[i];
                myMergeArray[m] = temValue;
                m++;
            }

        }
        // copy Array 2 to Merge Array
        for (int j = myArray1.length; j < myMergeArray.length - 1; j++) {
            for (int i = 0; i < myArray2.length; i++) {
                int temValue = myArray2[i];
                myMergeArray[j] = temValue;
                j++;
            }

        }
        // sort Merge array
        for (int i = 0; i < myMergeArray.length; i++) {
            for (int m = 0; m < myMergeArray.length - 1; m++) {
                if (myMergeArray[m] > myMergeArray[m + 1]) {
                    int tempValue = myMergeArray[m];
                    myMergeArray[m] = myMergeArray[m + 1];
                    myMergeArray[m + 1] = tempValue;
                }
            }
        }

        System.out.println("my merge array: " + Arrays.toString(myMergeArray));
    }
}
