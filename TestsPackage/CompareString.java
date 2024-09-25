package TestsPackage;

public class CompareString {


    public static void main(String[] args) {

        String s1 = "sonam";
        String s2 = "Sonam";

        String str1 = new String("sonam");
        String str2 = new String("Sonam");

        Boolean result = s1.equals(s2);
        System.out.println(result);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

        System.out.println("=============================");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));


    }
}
