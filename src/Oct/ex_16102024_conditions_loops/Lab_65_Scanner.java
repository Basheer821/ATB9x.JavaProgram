package Oct.ex_16102024_conditions_loops;

import java.util.Scanner;

public class Lab_65_Scanner {
    public static void main(String[] args) {

        //Scanner - class
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "Allowed to goa" :"Not allowed to goa");
    }
}
