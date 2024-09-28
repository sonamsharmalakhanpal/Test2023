package testPackage;

public class NextGreaterInt {

    public static void main(String[] args) {
        int arr[] = {2,3,11,9};
        //o/p 2-3,3-11,2-9,9--1

        nextGreater(arr);

    }

    private static void nextGreater(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int next = -1;
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]<arr[j]){
                    next = arr[j];
                    break;
                }



            }

            System.out.println(arr[i]+"---->"+next);



        }


    }
}
