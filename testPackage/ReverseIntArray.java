package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseIntArray {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50};
        //o/p-reverse the array - 50,40,30,20
       /* int low = 0;
        int high = arr.length-1;

            while (low<high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //2nd method by using collection-put arr to ArrayList
        List<Integer> list = new ArrayList<>();
        for (int a:arr){
            list.add(a);
        }
        Collections.reverse(list);
        System.out.println(list);



    }
}
