package Oct.ex_17102024_ifcondition;

import java.util.Scanner;

public class Lab_71 {
    public static void main(String[] args) {
        //Create a program -take user input
        // check weather the input is even or odd number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number, i will tell you odd or even");
        int num=sc.nextInt();

        //moudlus -->%
        //10%2 --->0
        //10%3-->1
        if(num%2==0){
            System.out.println("NUmber is -->Even number");
        }
        else{
            System.out.println("number is -->odd number");
        }
        sc.close();


    }
}
