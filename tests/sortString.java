package tests;

import java.util.Arrays;

public class sortString {

    public static void main(String[] args) {

        String str = "sonam";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String str2 = new String(ch);
        System.out.println(str2);




    }
}
