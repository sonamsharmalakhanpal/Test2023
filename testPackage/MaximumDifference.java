package testPackage;

public class MaximumDifference {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 90};
        int max = arr[0];
        int min = arr[0];

        //o/p - max-min = max difference

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }


        System.out.println("Maximum differnce is:" + (max - min));
    }

}
