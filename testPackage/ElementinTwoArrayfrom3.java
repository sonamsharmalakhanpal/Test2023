package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElementinTwoArrayfrom3 {

    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 5, 9};
        Integer[] arr2 = {2, 8, 9, 10};
        Integer[] arr3 = {5, 11, 12, 2,10,8};

        //convert arr to ArrayList so that add in hashset

        List<Integer> l1 = Arrays.asList(arr1);
        List<Integer> l2 = Arrays.asList(arr2);
        List<Integer> l3 = Arrays.asList(arr2);

        //first pull all unique by adding it to hashset and then with if and AND check atleast hs present in two list

        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(l1);
        hs.addAll(l2);
        hs.addAll(l3);

        List<Integer> finallist = new ArrayList<>();

        //now all unique in hs check in l1,l2,l3
        for (Integer num : hs) {
            if (l1.contains(num) && l2.contains(num) || l2.contains(num) && l3.contains(num) || l1.contains(num) && l3.contains(num)) {
                finallist.add(num);
            }
        }


        System.out.println(finallist);

    }
}
