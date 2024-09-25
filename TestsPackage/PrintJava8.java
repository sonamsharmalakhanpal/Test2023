package TestsPackage;

import java.util.Arrays;

public class PrintJava8 {

    public static void main(String[] args) {

        int arr[] = {2,3,5,6,7,8};

        System.out.println("Method1-For Each");
        Arrays.stream(arr).forEach(ele-> System.out.println(ele));


        System.out.println("Method2");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Method3-enhanced for loop");
        for (int i : arr){
            System.out.println(arr[i]);
        }

        System.out.println("Method4-Classic for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Method5- ");


    }
}
