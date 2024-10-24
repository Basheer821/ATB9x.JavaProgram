package Oct.ex_17102024_ifcondition;

import java.util.Scanner;

public class Lab_67_if_else {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        int age =sc.nextInt();

        if(age > 18){
            System.out.println("Eligealible for Vote");
        }
        else{
            System.out.println("Not Eligeable for vote");
        }
    }
}
