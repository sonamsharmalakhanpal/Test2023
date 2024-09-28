package testPackage;

public class DeleteElement {

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7};
        int del_ele = 6;
        int[] narr = deleteMethod(arr,del_ele);
        for (int i = 0; i < narr.length; i++) {
            System.out.println(narr[i]);
        }
    }

    private static int[] deleteMethod(int[] arr, int delEle) {
        int[] narr = new int[arr.length-1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=delEle){
                narr[index] = arr[i];
                index++;
            }



        }
        return narr;
    }
}
