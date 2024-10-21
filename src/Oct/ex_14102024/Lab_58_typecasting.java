package Oct.ex_14102024;

public class Lab_58_typecasting {
    public static void main(String[] args) {
        long phone_no=9876543210l;
        //
        //short s= phone_no//implict -jvm
        short s= (short)phone_no; //explicit -user -loss that data
    }
}
