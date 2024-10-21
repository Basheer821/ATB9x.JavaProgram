package Oct.ex_14102024;

public class Lab_57_typecasting {
    public static void main(String[] args) {
        //type casting -
        //widening -implicit, Explicit - lossless
        //Narrowing - implicit, Explicit (with data type),loss

        byte b=10;
        int a =b;//valid  ->implicit casting -JVM
        int a1 =(int)b; //valid ->Explicit casting -Jvm
      //
        int val =200;
        //byte b2= val; //invalid -implicit -JVM
        byte b3 =(byte)val;//invalid -Explicit -user
    }
}
