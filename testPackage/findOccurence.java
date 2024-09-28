package testPackage;

import java.util.*;
import java.util.stream.Collectors;

public class findOccurence {

    public static void main(String[] args) {
        String str = "Banana";
        findoccu(str);
    }

    private static void findoccu(String str) {
        Integer count = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] chstr = str.toCharArray();
        for (int i = 0; i < chstr.length; i++) {
            if(hm.get(chstr[i])==null){
                hm.put(chstr[i],1);
            }else{
                hm.put(chstr[i],++count);
            }
        }

        Set<Map.Entry<Character,Integer>> set = hm.entrySet();
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        for(Map.Entry<Character,Integer> entry: list){
            System.out.println(entry.getKey()+"-"+entry.getValue());

        }





    }


}
