package Oct.ex_17102024_ifcondition;

import java.util.Scanner;

public class Lab_72_if_Elseif_else {
    public static void main(String[] args) {
        //Condition  -2 outputs?
        //Can we have two or more outputs?
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int num1=sc.nextInt();
        System.out.println("enter number2");
        int num2= sc.nextInt();
        //1-->num1> num2
        //2->num2>num1
        //3-->num1=num2
        if(num1>num2){
            System.out.println("num1 > num2");
        }else if(num2 > num1){
            System.out.println("Num2 > num1");
        }else {
            System.out.println("both are same");
        }
    }
}
