package Oct.ex_15102024_operators;

public class Lab_62 {
    public static void main(String[] args) {
        //Nested ternary
        // result =condition1 ? expression1: (condition2 ? condition2 :condition3);
        // grade -system - score >=90 --->A
        // grade -system - score >=80---->B
        // grade -system - score >=70---->C
        // grade -system - score >=60---->D
        // grade -system - score <60-----F
        int score =80;
        String grade =(score>=90) ?"A":(score>=80) ?"B":(score>=70)?"C":(score>60) ?"D":"F";
        System.out.println("My grade is " + grade);
        System.out.printf("My Grade is %s",grade);
    }
}
