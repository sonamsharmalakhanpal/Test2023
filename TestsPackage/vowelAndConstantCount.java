package TestsPackage;

public class vowelAndConstantCount {

    public static void main(String[] args) {

        String str1 = "Sonam";
        int vowelCount=0;
        int constantCount=0;
        char[] ch = str1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (vowelAndConstantCountMethod(ch[i])) {
                vowelCount++;
            } else {
                constantCount++;
            }
        }

        System.out.println("vowel count is "+vowelCount);
        System.out.println("constant count is "+constantCount);
    }

    private static boolean vowelAndConstantCountMethod( char ch) {
        Boolean flag = false;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                flag = true;

            }



        return flag;
    }
}
