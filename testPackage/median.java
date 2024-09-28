package testPackage;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,2,8};
        System.out.println(findMedian(arr));

    }

    private static double findMedian(int[] arr) {
        //first sort the array also using Arrays.sort()
        //length = array.length
        //median - if array length is odd then simply array[length/2] is median or in
        //case of odd formula is ( array[length/2-1] + array[length/2] )/2.0

        Arrays.sort(arr);
        int length = arr.length;

        if(length%2==0){
            return arr[length/2];
        }else{
            return ( arr[length/2-1] + arr[length/2] )/2.0;
        }



    }
}
