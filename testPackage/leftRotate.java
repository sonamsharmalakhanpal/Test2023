package testPackage;

public class leftRotate {

    //o/p - 30,10,17,18,20
    /* logic- first store first index value to temp = arr[0] then
    start for loop with index 1 and then arr[i-1] = arr[i] , 1st postion element shift to 0 index and so on and then
    arr[arr.length -1] = temp and print the arr with for loop
     */

    public static void main(String[] args) {

        int arr[] = {20,30,10,17,18};

        int temp = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;

        //print the arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }



}
