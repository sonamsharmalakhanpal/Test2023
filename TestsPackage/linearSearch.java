package TestsPackage;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 6, 4, 8};
        int searchele = 4;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==searchele){
                System.out.println("Element found at postion "+i);
            }

        }
    }




}
