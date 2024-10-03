package TestsPackage;

public class binarySearch {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 6, 7, 8};
        int searchele = 4;

        searchElementMethod(arr, searchele);

    }

    private static void searchElementMethod(int[] arr, int searchele) {
        Boolean flag = false;
        //formula for binary search find mid and then decide either l=m+1 or h=m-1
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>searchele){
                high=mid-1;
            }else if(arr[mid]<searchele) {
                low = mid + 1;
            }else if(arr[mid]==searchele){
                System.out.println("element found at position "+mid);
                flag= true;
                break;
            }




        }
        if(flag=false){
            System.out.println("element not found");
        }

    }


}
