package testPackage;

import java.util.Scanner;

public class primeNumber {

    // prime number which is only divisibe by 1 and number itself

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int count = 1;

        for (int i = 1; i < num; i++) {
           if(num%i==0) {
               count++;
           }
        }

        if(count==2){
            System.out.println("Given number "+num+" is prime number");
        }else {
            System.out.println("Given number "+num+" is not prime number");
        }


    }
}
