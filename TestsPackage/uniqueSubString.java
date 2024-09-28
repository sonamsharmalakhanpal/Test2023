package TestsPackage;

import java.util.HashSet;

public class uniqueSubString {


    public static void main(String[] args) {
        String str = "exampleexam";
        //o/p-exampl

        findUniqueSubstring(str);


    }

    private static void findUniqueSubstring(String str) {
        String longestUniqueSubstring = "";

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                longestUniqueSubstring = longestUniqueSubstring + str.charAt(i);
            }
        }

        System.out.println(longestUniqueSubstring);

    }
}
