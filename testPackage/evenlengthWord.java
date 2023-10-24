package testPackage;

public class evenlengthWord {

    public static void main(String[] args) {
        String str = "Hello Bang abcd delhi";
        //output- display even length word bang

        for (String s: str.split(" ")){int i = 0;
            if((s.length()%2)==0){
                System.out.println(s);
            }
        }
    }
}
