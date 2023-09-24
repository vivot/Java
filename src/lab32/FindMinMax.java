package lab32;


public class FindMinMax {
    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5,6,7,8,9,10};
        //  Assign maxValue  first element of Array
        int maxValue =myIntArray[0];
        //  Assign minValue  first element of Array
        int minValue =myIntArray[0] ;
        // find min value
        for (int i=0;i< myIntArray.length-1; i++) {
            {
                if (myIntArray[i] > myIntArray[i+1]) {
                    minValue = myIntArray[i+1];
                }
            }
        }
        System.out.printf("Minimum number is %d\n", minValue);
        // find min value
        for (int i = 1; i < myIntArray.length -1; i++) {
            if (myIntArray[i] < myIntArray[i+1]) {
                maxValue = myIntArray[i+1];
            }
        }
        System.out.printf("Maximum number is %d\n", maxValue);

    }
}
