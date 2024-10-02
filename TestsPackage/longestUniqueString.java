package TestsPackage;

import java.util.HashSet;

public class longestUniqueString {


    public static void main(String[] args) {
        String str = "abcdab";
        System.out.println(lonestuniquestr(str));
    }

    private static String lonestuniquestr(String str) {
        String longestSubstring= "";
        String longestSubstringoverall = "";

        HashSet<Character> hs = new HashSet<>();




        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!hs.contains(ch)){
                hs.add(ch);
                longestSubstring +=ch;
            }


            }




        return longestSubstring;
    }


}
