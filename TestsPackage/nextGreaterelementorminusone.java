package TestsPackage;

public class nextGreaterelementorminusone {


    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 3, 4, 1};
        // o/p 3-5,5--1,2-3,4--1
        nextgreaterMethod(arr);
    }

    private static void nextgreaterMethod(int[] arr) {
        int next;
        for (int i = 0; i < arr.length; i++) {
            next = -1;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }


            }

            System.out.println(arr[i] +" - "+ next);

        }
    }


}


