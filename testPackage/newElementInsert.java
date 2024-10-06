package testPackage;

public class newElementInsert {

    public static void main(String[] args) {

        int[] arr = {2,3,5,6,7};
        int ele = 4;
        int loc = 2;
        int temp = arr[arr.length-1];



        for (int i = arr.length-1; i >loc ; i--) {
            arr[i] = arr[i-1];
        }

        arr[loc] = ele;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(temp);

    }

}
