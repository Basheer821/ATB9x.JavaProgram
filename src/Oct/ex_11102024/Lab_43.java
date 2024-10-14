package Oct.ex_11102024;

public class Lab_43 {
    public static void main(String[] args) {
        String first_name="Basheer";
        String last_name="Shaik";
        int a=10;
        int b=20;
        System.out.println(first_name+last_name+a+b);
        //BasheerShaik1020 - first operator -+ performed as concotination
        System.out.println(a+b+first_name+last_name);
        //First +match -->30 BasheerShaik
        System.out.println(first_name+last_name+(a+b));
    }
}
