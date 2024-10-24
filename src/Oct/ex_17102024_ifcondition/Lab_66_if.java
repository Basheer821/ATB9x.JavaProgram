package Oct.ex_17102024_ifcondition;

import java.util.Scanner;

public class Lab_66_if {
    public static void main(String[] args) {

       /* int age =20;
        //Allow to vote or not
        //if age > 18 ->allowed to vote
        if(age >19){
            System.out.println("allow for vote");
        }*/

        Scanner sc= new Scanner(System.in);
        int age =sc.nextInt();
        if(age > 28){
            System.out.println("Eligealible for Vote");
        }
    }
}
