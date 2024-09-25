package TestsPackage;

public class MaxAndMinNumber {


    public static void main(String[] args) {

        int arr[] = {2,3,9,8,7,0,1};

        // op- find max number and min number

        System.out.println(maxNumber(arr));
        System.out.println(minNumber(arr));

    }

    private static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }

    private static int maxNumber(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }


}
