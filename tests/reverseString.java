package tests;

public class reverseString {

    public static void main(String[] args) {

     String str = "Madam";

        System.out.println(reverseStringMethod(str));

        if(str.equalsIgnoreCase(reverseStringMethod(str))){
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");
        }




    }

    private static String reverseStringMethod(String str) {



        String rev ="";

        for (int i = str.length()-1; i >=0 ; i--) {

            rev = rev+str.charAt(i);
        }


        return rev;
    }


}
