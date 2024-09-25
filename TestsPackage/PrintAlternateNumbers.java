package TestsPackage;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintAlternateNumbers {

    public static void main(String[] args) {

        //Method 1 -print alternate numbers -for loop and print with 2 increment
        System.out.println("Method1");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        //Method 2 - same way with for loop but use StringBuilder object and append method from string Builder class
        System.out.println("Method2-same way with for loop but use StringBuilder object and append method from string Builder class");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 100; i += 2) {
            sb.append(i).append("\n");
        }

        System.out.println(sb.toString());  //if we use string Builder then in for loop we just append and then we have to sout again with toString() to print it

       //method3- with Java 8 array stream or Integer.range
        System.out.println("Method3-with stream");
        int arr[] = {1,2,3,4,5,6,7,8,9,10}; //if arr is already given and from that we have to print alternate numbers
        Arrays.stream(arr).filter(e->(e%2==0)).forEach(System.out::println);

        //if arr is not given just range is given and from that we have to print alternate numbers then use IntStream.range
        IntStream.range(0,100).filter(e->(e%2!=0)).forEach(System.out::println);


    }
}
