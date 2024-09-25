package TestsPackage;

public class CountWords {

    public static void main(String[] args) {
        String s = "My name is Sonam";

        System.out.println("The number of count in given scentence is "+countWordlength(s));

    }

    private static int countWordlength(String s) {
        int count = 0;

        if(s.charAt(0)!=' '){ //increment the count if first word is not empty or space otherwise without this condition check always one less count will come
            count=1;
        }
            for (int i = 0; i < s.length(); i++) {


            if ((s.charAt(i) == ' ') && s.charAt(i + 1) != ' ') { // note after == space will come in single quote ' ' and second cond is i+1 not be space
                count++;
            }
        }

        return count;
    }
}
