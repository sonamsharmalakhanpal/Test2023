package TestsPackage;

public class MaxandMin {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,7};

        System.out.println(findMaxMethod(arr));
        System.out.println(findMinMethod(arr));
    }

    private static int findMinMethod(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];
            }

        }

        return max;
    }

    private static int findMaxMethod(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){
                min = arr[i];
            }

        }

        return min;
    }
}
