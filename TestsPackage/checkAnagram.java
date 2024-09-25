package TestsPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkAnagram {

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";

        Boolean flag = false;

        //two ways are there method 1 convert to charArray and Arrays.sort and checkequal
        //method 2 put in hash map find occurence and then check occurence/maps are equal or not
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            flag = true;
        }

        System.out.println("The given Strings " + str1 + " " + str2 +" are Anagrams "+flag);


        //System.out.println("The given Strings " + str1 + " " + str2 +" are Anagrams"+isAnagram(str1, str2));
    }

    public static Boolean isAnagram(String str1, String str2) {

        Boolean flag = false;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i <= str1.length()-1; i++) {
            char ch = str1.charAt(i);
            Integer count = hm.get(ch);
            if (count == null) {
                hm.put(ch, 1);
            } else {
                hm.put(ch, ++count);
            }
        }

        for (Map.Entry<Character,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i <= str2.length()-1; i++) {
            char ch = str2.charAt(i);
            Integer count = hm2.get(ch);
            if (count == null) {
                hm2.put(ch, 1);
            } else {
                hm2.put(ch, ++count);
            }
        }

        for (Map.Entry<Character,Integer> entry: hm2.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        if (hm.equals(hm2)) {
            flag = true;
        }


        return flag;
    }
}
