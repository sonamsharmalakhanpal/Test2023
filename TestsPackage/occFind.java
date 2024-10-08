package TestsPackage;

import java.util.*;

public class occFind {

    public static void main(String[] args) {

        int[] arr = {3,4,2,2,4};

        occFindfMethod(arr);

    }

    public static void occFindfMethod(int[] arr){

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer count = hm.get(arr[i]);
            if(count==null){
                hm.put(arr[i],1);
            }else{
                hm.put(arr[i],++count);
            }

        }

        Set<Map.Entry<Integer,Integer>> set = hm.entrySet();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });



       for(Map.Entry<Integer,Integer> map:list){
           System.out.println(map.getKey()+"==="+ map.getValue());
       }

    }




}
