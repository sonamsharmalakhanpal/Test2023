package testPackage;

public class PerfectSqaureSort {

    public static void main(String[] args) {

        int[] arr = {-1, 4, 16, 2, 3};
        int squareArray[] = perfectSortSquare(arr);
        for (int i = 0; i < squareArray.length-1; i++) {
            System.out.println(squareArray[i]);
        }

    }

    private static int[] perfectSortSquare(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int[] sqaureArray = new int[arr.length];
        int squareIndex = arr.length - 1;

        while (start<=end) {
            if (arr[start] * arr[start] > arr[end] * arr[end]) {
                sqaureArray[squareIndex--] = arr[start] * arr[start];
                start++;
            } else {
                sqaureArray[squareIndex--] = arr[end] * arr[end];
                end--;
            }
        }

        return sqaureArray;
    }
}
