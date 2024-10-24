package Oct.ex_18102024_ifcondition_switch;

public class Lab_80 {
    //jdk >13
    public static void main(String[] args) {
        int item=001;//JDK>13
        switch (item){
            case 001,002,003:
                System.out.println("All of the them are Electronic gadget");
                break;
            case 004,005,006 :
                System.out.println("this is mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
