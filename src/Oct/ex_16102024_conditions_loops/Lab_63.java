package Oct.ex_16102024_conditions_loops;

import java.awt.geom.GeneralPath;
import java.sql.SQLOutput;

public class Lab_63 {
    public static void main(String[] args) {
        //Create a program to check Wheather shesheh trivedi will go to Goa or not
        //Take a input age  =Shesheh -> Goa
        //age > 25 -->Drinking -goa
        //Ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.printf("%s,%s,%s", args[0],args[1],args[2]);
        int age =Integer.parseInt(args[1]);
        System.out.println(age > 25 ? "Allowed to goa" :"Not allowed to goa");

    }
}
