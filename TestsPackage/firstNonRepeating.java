package TestsPackage;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {

    public static void main(String[] args) {

        int[] arr = {2,3,4,4,5,5,6,7};

        firstRepeatingMethod(arr);
    }

    private static void firstRepeatingMethod(int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer count = hm.get(arr[i]);

            if(count==null){
                hm.put(arr[i],1);
            }else{
                hm.put(arr[i],++count);
            }

        }

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"===="+entry.getValue());
                break;
            }
        }
    }
}
