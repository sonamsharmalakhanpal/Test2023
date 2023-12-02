package testPackage;

import java.util.HashSet;

public class missingNumber {

    public static void main(String[] args) {
        Integer[] arr = {2,4,6,7,8,9};
        findMissingNumber(arr);
    }

    private static void findMissingNumber(Integer[] arr) {

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            hs.add(arr[i]);
        }

        int n = arr.length+1;

        for (int i = 0; i < n; i++) {
            if(!hs.contains(i)){
                System.out.println(i);
            }
        }
    }
}
