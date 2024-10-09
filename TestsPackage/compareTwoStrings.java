package TestsPackage;

public class compareTwoStrings {

    public static void main(String[] args) {

        String str1 = "sonam";
        String str2 = "Sonam";
        String str3 = "sonam";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2) == 0);
        System.out.println(str1.compareToIgnoreCase(str2) == 0);
        System.out.println(str1 == str3);

        //without built in method

        Boolean flag = true;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();


        for (int i = 0; i < ch1.length; i++) {


                if (ch1[i]!=ch2[i]){
                    flag = false;
                    break;
                }



        }

        if (flag==true){
            System.out.println("Given String is equal");
        }else{
            System.out.println("Given String is not equal");
        }
        }




    }



