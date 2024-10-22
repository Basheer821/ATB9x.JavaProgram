package TASK.task_16102024;

public class task_16102024 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //A-> ++a-> EXP1 ->11,a->11
        //B-> a++-> EXP1 ->11,a->12
        //C-> a++-> EXP1 ->12,a->13

        //A+B+C ->34 ,a->13
    }
}
