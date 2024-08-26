package Tests2024;

import java.util.Arrays;

public class MedianArray {

    public static void main(String[] args) {
        //median array for odd count list is n/2(middle element
        //but for even count list is median = (arr[length/2-1] + arr[length/2])/2;

        int[] arr = {3,5,1,4,2,6};
        int length = arr.length;

        System.out.println("median of this arr is "+median(arr,length));
    }

    private static double median(int[] arr, int length) {

        double median =0;
        //first sort the array
        Arrays.sort(arr);



        //second now calcualate based on condition count/length is even or odd
        if(length%2==0){                    //even count of list-difficult to divide so formula applies
            median = (double) (arr[length/2-1]+arr[length/2])/2;
        }else{                               //odd count of list simply n/2
            median = arr[length/2];
        }


        return median;
    }
}
