package testPackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcd";
        //o/p= c;
        //solution used LinkedHashMap-it will maintain insertion order and we will find out first char

        Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            Integer count = hm.get(ch);
            /*if(count==null){
                hm.put(ch,1);
            }else{
                hm.put(ch,++count);
            }*/
            hm.put(ch,hm.containsKey(ch) ? hm.get(ch)+1 : 1);
        }



        Set<Map.Entry<Character,Integer>> m = hm.entrySet();
        for(Map.Entry<Character,Integer> e:m){
            if(e.getValue()==1){
                System.out.println(e.getKey()+"===="+e.getValue());
                break;
            }

        }

    }
}
