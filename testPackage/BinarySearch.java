package testPackage;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


//        Binary searchrule list/arr should be sorted first

        int arr[] = {80, 90, 20, 40, 30, 10};

        System.out.println("array without sort" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sort" + Arrays.toString(arr));

        int ele =90;

        int high = arr.length - 1;
        int low = 0;
        boolean flag = false;

        int i = 1;

        while (low <= high) {

            int mid = (low+high) / 2;

            if (arr[mid] < ele) {


                low = mid + 1;


            } else if (arr[mid] > ele) {


                high = mid - 1;

            } else if (arr[mid] == ele) {

                System.out.println("Element find at position " + mid);
                flag= true;
                break;

            }


        }

        if(flag==false){
            System.out.println("element not found in list");
        }
    }
}


