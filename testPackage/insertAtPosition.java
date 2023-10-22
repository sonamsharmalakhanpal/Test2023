package testPackage;

import java.util.Scanner;

public class insertAtPosition {

    public static void main(String[] args) {

        int arr[] = {10,20,40,50};

        int lastele = arr[arr.length-1];

        System.out.println("store last element first"+lastele);

        int newnumber = 30;
        int loc = 1;

        for (int i = arr.length-1; i >loc; i--) {
            arr[i] = arr[i-1];
        }

        arr[loc] = newnumber;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(lastele);
    }
}
