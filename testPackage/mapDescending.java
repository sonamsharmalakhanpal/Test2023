package testPackage;

import java.util.*;

public class mapDescending {

    public static void main(String[] args) {

        String s = "Banana";
        // o/p a-3,n-2,b-1

        findOccurenceinDesc(s);


    }

    private static void findOccurenceinDesc(String s) {
        Integer count = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == null) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), ++count);
            }

        }

        /*for(Map.Entry<Character,Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }*/
        Set<Map.Entry<Character,Integer>> set = hm.entrySet();
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<Character,Integer> entry: list){
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }
    }
}
