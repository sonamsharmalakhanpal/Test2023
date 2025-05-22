package Test1;

public class task2 {


    public static void main(String[] args) {
        System.out.println(task2Method(new int[]{4, 1, 2, 3})); // ➜ 6
        System.out.println(task2Method(new int[]{1, 2, 3, 3, 2, 1, 5})); // ➜ 7
        System.out.println(task2Method(new int[]{1000000000, 1, 2, 2, 1000000000, 1, 1000000000})); // ➜ 999999998
        System.out.println(task2Method(new int[]{5})); // ➜ 0
        System.out.println(task2Method(new int[]{1, 2, 3, 4, 5})); // ➜ 10
        System.out.println(task2Method(new int[]{5, 4, 3, 2, 1})); // ➜ 0
        System.out.println(task2Method(new int[]{1, 2, 3, 1, 2})); // ➜ 3
        System.out.println(task2Method(new int[]{1, 1000000000})); // ➜ 999999999
        System.out.println(task2Method(new int[]{1})); // ➜ 0
        System.out.println(task2Method(new int[]{}));

    }

    public static int task2Method(int[] A) {
        long income = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                income += (long)(A[i] - A[i - 1]);
            }
        }

        return (int)(income % 1_000_000_000);  // Return last 9 digits
    }


    }

