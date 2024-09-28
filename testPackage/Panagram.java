package testPackage;

public class Panagram {

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";

        if(isPanagram(s.toLowerCase())){
            System.out.println("Given String: "+s+" is panagram");
        }else{
            System.out.println("Given String: "+s+" is not panagram");
        }


    }

    private static Boolean isPanagram(String s) {
        if (s.length() < 26) {
            return false;
        }
            for(char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }

        return true;
        }

    }

