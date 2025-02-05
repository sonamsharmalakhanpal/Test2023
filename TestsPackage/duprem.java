package TestsPackage;

import java.util.HashSet;

public class duprem {

    public static void main(String[] args) {

        int[] arr = {3,4,5,4,5,6,7};

        removeDupilcateMethod(arr);
    }

    public static void removeDupilcateMethod(int[] arr){

        HashSet<Integer> hs = new HashSet<>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
        }

        System.out.println(hs);
    }
}
