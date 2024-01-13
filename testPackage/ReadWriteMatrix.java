package testPackage;

import java.util.Scanner;

public class ReadWriteMatrix {

    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter number of cols");
        int c = sc.nextInt();
        System.out.println("Enter the elements of the matrix");

        int matrix[][]=new int[r][c];

        //store elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]= sc.nextInt();
            }

        }
        sc.close();

        //print elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);


            }
            System.out.println();

        }
    }
}
