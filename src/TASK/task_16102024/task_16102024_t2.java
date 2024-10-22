package TASK.task_16102024;

public class task_16102024_t2 {
    public static void main(String[] args) {
        int a =20;
        System.out.println(--a +a++ + a--);
        System.out.println(a);
        //EXP1--->--a--19---->a+=19
        //EXP2--->a++--19--->a=20
        //EXP3--->--a--20--->a=19
        //A+B+C=58

    }
}
