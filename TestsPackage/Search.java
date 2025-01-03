package TestsPackage;

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {

        int[] arr = {80, 90, 20, 40, 30, 10};



        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //linearSearchMethod(arr,searchEle);
        int searchEle=90;
        int high=arr.length-1;
        int low=0;
        Boolean flag = false;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<searchEle){
                low = mid+1;
            }else if(arr[mid]>searchEle){
                high = mid-1;
            }else if(arr[mid]==searchEle){
                System.out.println("Element find at position " + mid);
                flag=true;
                break;
            }

        }


        if(flag==false){
            System.out.println("Element not found");
        }


    }

   /* private static void linearSearchMethod(int[] arr,int searchEle) {

        for (int i = 0; i < arr.length; i++) {
         if(arr[i]==searchEle){
             System.out.println("Element "+arr[i]+" found at postion "+i);
         }


        }
    */}



