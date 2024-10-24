package Oct.ex_18102024_ifcondition_switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_75_HackerrankQ2 {
    public static void main(String[] args) {
        //Triangle Classifier:
        //wright a program that classifies a triangle based on its side lengths.
        //Given three input vlues respenting the length of the sides, determine
        //side1,side2,side2 ->eq,iso scalene

        //logic bulding
        //Step1
        //find the inputs/outputs
        //input |side1,side2,side3 ->(0-100)->data type->double
        //output | sop ->string or message ->Equilateral ,Isosceles,Scalene.

        //Basic logic |Rough Logic
        //if side1== side2 and side2==side3-> side1==side3->eq
        //side1==side2 ||side1==side3||side2==side3-->iso
        //else ->scalene

        //Step3

        Scanner sc = new Scanner(System.in);
        //Input: Read the length of the sides
        System.out.println("Enter the leangth of the side1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the side 3: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the side3: ");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("invalid input :side length must be positive: ");
        } else if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("The triangle is quailateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("triangle is scalene");
        }
        sc.close();
    }
}
