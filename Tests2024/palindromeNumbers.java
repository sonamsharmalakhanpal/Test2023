package Tests2024;

public class palindromeNumbers {

    public static void main(String[] args) {


        int number = 121;


        //Method1: with simple math formula n%10 and n=n/10 reverse the digit and then vheck equal
        if (isPalindrome(number)) {
            System.out.println("Given number " + number + " is Palindrome");
        } else{
            System.out.println("Given number " + number + " is not Palindrome");
        }


    }


    private static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        return (original==reverse);
    }
}