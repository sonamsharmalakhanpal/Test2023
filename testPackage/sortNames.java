package testPackage;

public class sortNames {
    public static void main(String[] args) {
        String[] strarr = {"sonam", "muneet", "evu"};

        sortnamessmethod(strarr);

    }

    private static void sortnamessmethod(String[] strarr) {

        for (int i = 0; i < strarr.length; i++) {

            for (int j = i+1; j < strarr.length ; j++) {


                if (strarr[i].compareTo(strarr[j]) > 0) {
                    String temp = strarr[i];
                    strarr[i] = strarr[j];
                    strarr[j] = temp;
                }
            }

        }

        for (String s : strarr) {
            System.out.println(s);
        }
    }

}
