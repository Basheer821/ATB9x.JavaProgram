package Oct.ex_23102024_Functions;

public class Lab_114 {
    public static void main(String[] args) {
        //user Defined Functions

        //1.without Argument/parameters and without return type.
     /*   for(int i=0;i<99;i++){
        great();
        }*/




        //2.Without parameters but with return type.
        String return_type=greet_with_hello();
        System.out.println(return_type);



        //3.with Parameters and without Return type.
           great_with_your_firstname_Lastname("Basheer" , "babu");



        //4.with parameters and with Return type.
        int result=sum_of_two_numbers(3,4);
        System.out.println(result);


    }
    //1.without parameters and without return type.
     static void great(){
         System.out.println("HI, how are you ");
     }
    //2.Without parameters but with return type
    static String greet_with_hello(){
        System.out.println("hi,I am type 2");
        return "hi,you are aware";

    }
    //3.with Parameters and without Return type.
    static void great_with_your_firstname_Lastname(String firstname, String lastname){
        System.out.println("Hi your name" +firstname +lastname);
    }
    //4.with parameters and with Return type
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }



}
