package testPackage;

public class wordsReverseinString {

    public static void main(String[] args) {

        String str = "My name is Sonam";
//        o/p = Sonam is my name;

        String[] strarr = str.split(" ");

        for (int i = strarr.length-1; i >= 0; i--) {
            System.out.print(strarr[i]+" ");
        }
    }
}
