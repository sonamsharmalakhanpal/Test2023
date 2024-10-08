package TestsPackage;

import java.util.HashSet;

public class duplicateRemove {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 5, 6, 7, 7};

        removeDuplicateMethod(arr);

    }

    private static void removeDuplicateMethod(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();
        int[] narr = new int[hs.size()];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
                hs.add(arr[i]);

            }

        System.out.println(hs);

        }



    }

