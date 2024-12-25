package Oct.ex_28102024_String_Functions_Arrays;

public class Lab_123_String_functions {
    public static void main(String[] args) {
        String anotherParameter ="Basheer babu!";
        String roar =anotherParameter.substring(10, 11);
        System.out.println(roar);

        //Sub string  -many inter views
        String s1="basheer";
        String s2 =s1.concat(" star boy");
        System.out.println(s2);


        String fruits ="Mango,orange,grapes";
        String [] fruitsArray= fruits.split(",");
        System.out.println(fruitsArray[0]);
        System.out.println(fruitsArray[1]);
        System.out.println(fruitsArray[2]);
        
    }
}
