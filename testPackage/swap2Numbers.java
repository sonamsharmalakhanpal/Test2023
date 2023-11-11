package testPackage;

public class swap2Numbers {

    public static void main(String[] args) {

        int a=20; int b=30;

        System.out.println("Number before swap"+" a= "+a+" b= "+b);

        /*int temp = a;
        a=b;
        b=temp;*/

        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("Number after swap"+" a= "+a+" b= "+b);
    }
}
