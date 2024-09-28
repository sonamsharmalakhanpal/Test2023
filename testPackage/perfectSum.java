package testPackage;

public class perfectSum {

    public static void main(String[] args) {
        int[] arr = {20,30,40,10,5,13,60};
        int sum = 50;
        //op- which two elements in arr are eqaul to sum

        //solution instead of finding a+b = sum , find sum-arr[i] = arr[j],then print arr[i] and arr[j]

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(sum-arr[i]==arr[j]){
                    System.out.println(arr[i]+","+arr[j]);
                }

            }

        }
    }
}
