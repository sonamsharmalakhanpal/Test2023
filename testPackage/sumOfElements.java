package testPackage;

import java.util.Arrays;

public class sumOfElements {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i] ;
        }

        System.out.println(sum);

        //2nd method
       int sum2 = Arrays.stream(arr).sum();
        System.out.println(sum2);

        //3rd method
        int s = Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
        System.out.println(s);

        //4th method
        long s2 = Arrays.stream(arr).summaryStatistics().getSum();
        System.out.println(s2);

    }
}
