package testPackage;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
        System.out.println("Jai Maa Parwati Ji. I Love you. I will practise hard");

        int[] arr = {3, 4, 2, 3, 4, 5, 7};
        removeDuplicate(arr);

        String[] arr2 = {"java", "Java", "python", "python"};
        removeStringDuplicate(arr2);
    }

    public static void removeStringDuplicate(String[] arr2) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            Integer count = hm.get(arr2[i]);
            if (count == null) {
                hm.put(arr2[i], 1);
            } else {
                hm.put(arr2[i], ++count);
            }
        }

        // Set<Map.Entry<String,Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }

        }


    }

    private static void removeDuplicate(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i : arr) {
            if (hs.add(i) == true) {
                System.out.println(i);
            }
            ;
        }


    }
}
