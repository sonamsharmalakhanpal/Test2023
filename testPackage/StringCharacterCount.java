package testPackage;

public class StringCharacterCount {


    public static void main(String[] args) {
        String s = "Hello Bengaluru";

        //hello-5 and Bengaluru-9

        String[] sarr = s.split(" ");
        for (String str : sarr) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                //char ch = str.charAt(i);
                    count++;
            }
            System.out.println(str+"----->"+count);
        }
    }
}

