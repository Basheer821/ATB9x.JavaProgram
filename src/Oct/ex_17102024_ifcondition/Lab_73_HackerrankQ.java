package Oct.ex_17102024_ifcondition;

import java.util.Scanner;

public class Lab_73_HackerrankQ {
    public static void main(String[] args) {
        // Grade calculator:
        //qright a program that calculattes and displays the letter grade
        //for a given numerical score (e.g., A,B,C,D,OR F)
        //based on the following grading scale:
        //
        //A:90-100
        //B:80-89
        //C:70-79
        //D:60-69
        //F:0-59

        //logic Building -java

        //step1
        //find the inputs/outputs
        //input|score--->(0--100)-->data type--->int
        //output|grade -->data type->char

        //2.basic logic |rough logic
        //if (score >=90 && score <=100)--> return or print grade -A
        //else if score<=89 && score>=80)--> retun or print grade-B
        //else if (score<=79 && score >=70)-->return or print grade -c
        //else if (socre<=69 && score >=60)--->return or print grade -d
        //else (score<=59 && score >=0) -->return or print grade -f

        //3.wright code
        Scanner sc=new Scanner(System.in);
        System.out.println("Ebter the score");
        int score= sc.nextInt();
        char grade ='F';

        if(score >=90 && score<=100){
            grade ='A';
        }else if(score >=80 && score <=89){
            grade='B';
        } else if (score >=70 && score <=79) {
            grade='C';
        } else if (score>=60 && score <=69) {
            grade ='D';
        } else if (score <=0 && score >100) {
            System.out.println("LOL!! are you god?");
            grade='0';
        } else {
            grade='F';
        }
        System.out.println("your grade is -->" + grade);




    }
}
