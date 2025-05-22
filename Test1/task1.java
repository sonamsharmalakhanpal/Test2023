package Test1;

import java.util.Arrays;

public class task1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve("ABABAB", new int[]{10, 20, 30, 40, 50, 60}))); // [30, 60]
        System.out.println(Arrays.toString(solve("BAAAB", new int[]{5, 10, 15, 20, 25}))); // [20, 5]
        System.out.println(Arrays.toString(solve("AABBB", new int[]{1, 2, 3, 4, 5}))); // [0, 9]
        System.out.println(Arrays.toString(solve("AB", new int[]{100, 100}))); // [0, 0]
        System.out.println(Arrays.toString(solve("AAB", new int[]{100, 50, 200}))); // [50, 150]
        System.out.println(Arrays.toString(solve("BA", new int[]{200, 100}))); // [100, 0]
        System.out.println(Arrays.toString(solve("ABBA", new int[]{10, 20, 30, 40}))); // [10, 10]
        System.out.println(Arrays.toString(solve("", new int[]{100}))); // [0, 0]
        System.out.println(Arrays.toString(solve("A", new int[]{50}))); // [50, 0]
        System.out.println(Arrays.toString(solve("B", new int[]{50}))); // [0, 50]
    }

    public static int[] solve(String R, int[] V) {
        int balA = 0, balB = 0;
        int minTopUpA = 0, minTopUpB = 0;

        for (int i = 0; i < R.length(); i++) {
            int value = V[i];
            if (R.charAt(i) == 'A') {
                if (balA < value) {
                    minTopUpA += value - balA;
                    balA = 0;
                } else {
                    balA -= value;
                }
            } else { // Recipient is 'B'
                if (balB < value) {
                    minTopUpB += value - balB;
                    balB = 0;
                } else {
                    balB -= value;
                }
            }
        }
        return new int[]{minTopUpA, minTopUpB};
    }
}
