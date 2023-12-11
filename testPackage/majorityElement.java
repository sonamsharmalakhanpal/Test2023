package testPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class majorityElement {

    public static void main(String[] args) {
        Integer[] arr = {6, 3, 4, 6, 6, 5};
        Integer n = arr.length / 2;
        findMajorityElement(arr, n);
    }

    private static void findMajorityElement(Integer[] arr, Integer n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = hm.get(arr[i]);
            if (count != null) {
                hm.put(arr[i], ++count);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : hm.entrySet())
        {
            if (map.getValue()>=n) {
                System.out.println(map.getKey() + "====>" + map.getValue());
            }

        }


    }
}
