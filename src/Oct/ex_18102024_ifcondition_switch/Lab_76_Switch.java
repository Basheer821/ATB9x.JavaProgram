package Oct.ex_18102024_ifcondition_switch;

import java.util.Scanner;

public class Lab_76_Switch {
    public static void main(String[] args) {
        //Switch Condition
        //User -Enter int number from 1 to 7
        //which day it is it
        //1-> monday,4-->thursday, 7->sum,8910..->invalid
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea ,what is the date");
                break;
        }
        System.out.println("this the end of the loop");
        sc.close();
    }
}
