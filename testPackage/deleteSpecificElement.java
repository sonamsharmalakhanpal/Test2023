package testPackage;

public class deleteSpecificElement {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 5, 6};
        // remove 4 from list
        int remove_ele = 4;

        //solution- take new array add each element to new array but only when element is not equal to given remove number and keep increasing the index number
        /*int[] newArr = new int[arr1.length-1];
        int index=0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=remove_ele){
                newArr[index] = arr1[i];
                index++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }*/


        int[] newarr = new int[arr1.length-1];
        int index = 0;

        for (int i = 0; i < arr1.length-1; i++) {
            if(arr1[i]!=remove_ele) {
                newarr[index] = arr1[i];
                index++;
            }

        }

        for (int a:newarr) {
            System.out.println(a);
        }


    }
}
