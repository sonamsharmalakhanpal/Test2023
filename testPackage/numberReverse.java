package testPackage;

import java.util.Scanner;

public class numberReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(numbereverseMethod(num));



    }

    private static int numbereverseMethod(int num) {

        int rev = 0;
        while (num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }



        return rev;
    }
}
