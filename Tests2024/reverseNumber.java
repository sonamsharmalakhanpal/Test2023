package Tests2024;

public class reverseNumber {

    public static void main(String[] args) {
        int num = 123;

        String str = "Sonam";

        //o/p - 321
        System.out.println(num);
        System.out.println(reverseNum(num));
        System.out.println(str);
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String reversestr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr = reversestr + str.charAt(i);
        }
        return reversestr;

    }

    private static int reverseNum(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }


        return rev;
    }
}
