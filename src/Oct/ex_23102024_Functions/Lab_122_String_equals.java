package Oct.ex_23102024_Functions;

import java.sql.SQLOutput;

public class Lab_122_String_equals {
    public static void main(String[] args) {
        String s1="Hello"; //scp
        String s9="Hello"; //scp
        String  s2= new String("Hello");
        String s3= new String ("Hello");
        String s4 =new String ("hello");


        //1Scp,3QA
        //==- Comparison
        System.out.println(s1==s3);
        System.out.println(s1=s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s9);

        //eqals(content)->value
        //how can i check the value?

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
