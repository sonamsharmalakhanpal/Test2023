package Tests2024;


import java.util.Scanner;

public class palindromeWord {

    public static void main(String[] args) {
        //String word = "madam";
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if(isPalindrome(word)){
            System.out.println("Given word is "+word+" is Palindrome");
        }else{
            System.out.println("Given word is "+word+" is not Palindrome");
        }
    }

    private static boolean isPalindrome(String word) {
        String originalString = word;
        String reverseString = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverseString = reverseString+word.charAt(i);
        }


        return (originalString.equals(reverseString));
    }

}
