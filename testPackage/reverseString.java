package testPackage;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello Bangalore";

        System.out.println(reverseStringMethod(str));
        String revStr = reverseStringMethod(str);

        if(str.equals(revStr)){
            System.out.println("String "+str+" "+revStr+"are panagram");
        }else{
            System.out.println("Strings are not panagram");
        }

    }

    private static String reverseStringMethod(String str) {
        String[] sarr = str.split(" ");
        String revStr = "";
        for (int i = sarr.length - 1; i >= 0; i--) {
            revStr = revStr+sarr[i]+" ";

        }
        return revStr;
    }
}
