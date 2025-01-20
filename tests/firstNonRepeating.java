package tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class firstNonRepeating {
    public static void main(String[] args) {

        String str = "abaccd";
        firstRepeatingMethods(str);
    }

    private static void firstRepeatingMethods(String str) {

        HashMap<Character,Integer> hm = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            Integer count = hm.get(ch[i]);
            if(count==null){
                hm.put(ch[i],1);
            }else{
                hm.put(ch[i],++count);
            }

        }

        Set<Map.Entry<Character,Integer>> map = hm.entrySet();
        for(Map.Entry<Character,Integer> entry:map){
            if(entry.getValue()>1) {
                System.out.println(entry.getKey() + "====" + entry.getValue());
                break;
            }

            }
        }


    }



