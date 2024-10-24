package Oct.ex_18102024_ifcondition_switch;

import java.util.Scanner;

public class Lab_76_switch_with_outBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("No idea ,what is the date");

        }
        System.out.println("this the end of the loop");
        sc.close();
    }
}
