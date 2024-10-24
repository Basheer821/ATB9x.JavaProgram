package Oct.ex_18102024_ifcondition_switch;

import java.util.Scanner;

public class Lab_77 {
    public static void main(String[] args) {
        //Web Automation
        //I will ask user which browser you want me to run the code.
        //chrome->execute chrome
        //firefox->execute firefox
        //edge-> edge browser cases.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser=sc.next();
        switch (browser){
            case "chrome" :
            System.out.println("Starting ");
                System.out.println(".........");
                System.out.println("asdfghxcvb");
            break;
            case "edge" :
                System.out.println("Starting ");
                System.out.println(".........");
                System.out.println("asdfghxcvb");
                break;
            case "firefox" :
                System.out.println("Starting ");
                System.out.println(".........");
                System.out.println("asdfghxcvb");
                break;
            default :
                System.out.println(" we browser i need to run");

        }
        sc.close();
    }
}
