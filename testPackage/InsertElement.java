package testPackage;

public class InsertElement {


    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6};
        int ele = 4;
        int loc = 2;
        int temp = arr[arr.length-1];

        int[] narr = insertElement(arr, ele, loc);

        for (int i = 0; i < narr.length; i++) {
            System.out.println(narr[i]);
        }

        System.out.println(temp);
    }

    private static int[] insertElement(int[] arr, int ele, int loc) {

        for (int i = arr.length-1; i > loc ; i--) {
            arr[i] = arr[i-1];
        }

        arr[loc] = ele;

        return arr;
    }

}
