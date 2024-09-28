package testPackage;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> c61027aeee6874e473957681ba6218c82e749937
public class reverseNumber {

    public static void main(String[] args) {

<<<<<<< HEAD
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
=======
        int num = 1254;
        int rev = 0;
        int count = 0;
        int evencount = 0;
        int oddcount = 0;

        while (num!=0){
            int n = num%10;
            if(n%2==0){
                evencount++;
                System.out.println("even number is "+n);
            }else{
                oddcount++;
                System.out.println("odd number is "+n);
            }
           rev = (rev*10)+n;
           num = num/10;
           count++;
        }

        System.out.println("reverse number is "+ rev);
        System.out.println("Number of digit in number is "+count);
        System.out.println("even count is "+evencount);
        System.out.println("odd count is "+oddcount);



    }


>>>>>>> c61027aeee6874e473957681ba6218c82e749937
}
