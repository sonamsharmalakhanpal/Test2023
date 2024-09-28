package testPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args) {

        String str = "Welcome";
        //o/p e-2


        /*//find duplicate using Hashset
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if(!hs.add(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }*/

        //find duplicate using HashMap

        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i <= str.length()-1; i++) {

            char ch = str.charAt(i);
            Integer count = hm.get(ch);
            if (count == null) {
                hm.put(ch, 1);
            } else {
                hm.put(ch, ++count);
            }
        }

            for(Map.Entry<Character,Integer> e: hm.entrySet()){
                System.out.println(e.getKey()+"---->"+e.getValue());
            }


        }



    }

