package testPackage;

public class moveZeroAtEnd {
    public static void main(String[] args) {


        int[] arr = {2, 0, 9, 0, 6, 0, 5};
        int[] newarr = movezero(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }

    }

    public static int[] movezero(int[] arr) {
        int[] newarr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newarr[index] = arr[i];
                index++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                newarr[index] = arr[i];
                index++;
            }
        }


        return newarr;
    }
}
