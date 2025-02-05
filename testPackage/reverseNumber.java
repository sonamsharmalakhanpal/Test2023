package testPackage;


import java.util.Scanner;


public class reverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverseMethod(num));
    }

    private static int reverseMethod(int num) {

        int rev = 0;
        while (num !=0){
          int n = num%10;
            rev = (rev*10)+n;
            num = num/10;
        }
        return rev;
    }



    }



