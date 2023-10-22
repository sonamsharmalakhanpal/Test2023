package testPackage;

public class ReverseWords {


    public static void main(String[] args) {
        System.out.println("Jai Maa Parwati ji, i have to learn intellij shortcuts");

        String s1 = "Hello Bangalore";
        //o/p Bangalore Hello

        String[] sarr = s1.split(" ");

        for (int i = sarr.length-1; i >= 0; i--) {
            System.out.print(sarr[i]+" ");
        }
    }
}
