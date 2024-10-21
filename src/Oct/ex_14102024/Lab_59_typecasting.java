package Oct.ex_14102024;

public class Lab_59_typecasting {
    public static void main(String[] args) {
        //GST =18.g
        int course =100;
        double gst=18.5;
        int total_price=course+(int)gst;// Narrowing --->Explicit
        System.out.println(total_price);
    }
}
