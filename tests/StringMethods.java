package tests;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Welcome Sonam Lakhanpal";
        countWords(str);


    }

    private static void countWords(String str) {
        int count = 0;
        if (str.length() > 0) {

            String[] strarr = str.split(" ");

            for (int i = 0; i < strarr.length; i++) {
                count++;
            }

            System.out.println(count);

        }
    }

    }



