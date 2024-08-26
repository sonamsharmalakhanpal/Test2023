package Tests2024;

public class reverseWords {

    public static void main(String[] args) {


        String str = "my name is Sonam";
       char[] ch =  str.toCharArray();
       String[] words = str.split(" ");

       for(int i = words.length-1;i>=0;i--){
           System.out.print(words[i]+" ");
       }

        /*for (int i = ch.length-1; i>0 ; i--) {
            System.out.print(ch[i]);
        }*/
    }
}
