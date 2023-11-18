package testPackage;

import java.util.Scanner;

public class perfectSquareOrSquareRoot {

    public static void main(String[] args) {

        // 1st method with built in method
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Double d = Math.sqrt(num);

        System.out.println("square root of "+num+" is "+d.intValue());


        // 2nd method without using math.sqrt
        for (int i = 1; i <= num/2; i++) {
            if(i*i==num){
                System.out.println("square root of "+num+" is "+i);
            }
        }

    }
}
