package testPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test2 {

    public static void main(String[] args) {
        String str = "hello Bangalore";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(String s:str.split(" ")){
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                Integer count = hm.get(ch);
                if(count==null){
                    hm.put(ch,1);
                }else{
                    hm.put(ch,++count);
                }
            }
        }

        //print all char count occurrence
        for(Map.Entry<Character, Integer> map:hm.entrySet()){
            System.out.println(map.getKey()+"--->"+map.getValue());
        }

        //print only duplicates one
        for (Map.Entry<Character,Integer> map:hm.entrySet()){
            if (map.getValue()>1){
                System.out.println(map.getKey());
            }
        }

        String st = "Hell oge";

        //print even length word
        for(String s:st.split(" ")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }

        char charr[] = st.toCharArray();

        for (int i = charr.length-1; i >=0; i--) {
            System.out.print(charr[i]);
        }


    }

}
