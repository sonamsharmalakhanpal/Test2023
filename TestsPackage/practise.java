package TestsPackage;

import java.util.*;

import static TestsPackage.practise.removeDuplicates;

public class practise {

    public static void main(String[] args) {

        int[] arr = {2,3,5,3,4,4,2};
        System.out.println(removeDuplicates(arr));
        firstNonRepeating(arr);
    }

    private static void firstNonRepeating(int[] arr) {
        LinkedHashMap lhm = new LinkedHashMap();
        for (int i = 0; i < arr.length; i++) {
            Integer count = (Integer) lhm.get(arr[i]);
            if(!lhm.containsKey(arr[i])){
                lhm.put(arr[i],1);
            }else{
                lhm.put(arr[i],++count);
            }
        }

      Set<Map.Entry<Integer,Integer>> st = lhm.entrySet();
        for(Map.Entry<Integer,Integer> e: st){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
    }

    public static ArrayList removeDuplicates(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
                arrayList.add(arr[i]);
            }
        }

        return arrayList;
    }
}
