package tests;



public class reverseNumber {

    public static void main(String[] args) {

        int num = 121;

        System.out.println(reverseNum(num));

        if(num==reverseNum(num)){
            System.out.println("Given number is plaindrome number");
        }else{
            System.out.println("Given number is not plaindrome number");
        }

    }

    public static int reverseNum(int num){
        
        int revnum = 0;
        
        while (num!=0){
            int n = num%10;
            revnum = revnum*10+n;
            num = num/10;
        }

        return revnum;
    }

}
