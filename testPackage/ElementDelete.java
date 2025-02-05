package testPackage;

public class ElementDelete {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int del_ele = 6;

        int[] newarr = deleteElementMethod(arr, del_ele);

        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }


    public static int[] deleteElementMethod(int[] arr, int del_ele) {
        int[] newarr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != del_ele) {
                newarr[index] = arr[i];
                index++;
            }
        }
        return newarr;
    }


}
