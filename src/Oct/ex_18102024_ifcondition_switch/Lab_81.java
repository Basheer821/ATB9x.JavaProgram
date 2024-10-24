package Oct.ex_18102024_ifcondition_switch;

public class Lab_81 {
    public static void main(String[] args) {
        int item =001; //JDK>13

        switch (item){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("none of them");

        }

    }
}
