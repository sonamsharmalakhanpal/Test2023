package testPackage;

public class deleteAtSpecificLoc {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        //o/p - remove element from 2nd index/position  means 4 should be removed here
        int remove_ele = 4;
        //iterate over arr but when ele = remove ele then arr[i] = arr[i+1]

        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]==remove_ele) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]= arr[j+1];
                }


            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }

    }
}
