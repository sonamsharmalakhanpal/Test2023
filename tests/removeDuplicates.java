package tests;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args) {

        int[] arr = {2,3,3,2,4,4,5};
        int[] result= removeDup(arr);
        for(int num:result){
            System.out.println(num);
        }

    }

    public static int[] removeDup(int[] arr){

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);

        }

        int[] newArr = new int[set.size()];
        int index =0;

        for (int num: set) {

            newArr[index++] = num;
        }
        return newArr;
    }
}
