package Oct.ex_22102024loops;

public class Lab_107 {
    public static void main(String[] args) {

        //two ways
        //1Arguments
        //2. Scanner class
        //3.BufferReader--R

        //Take a user input for the age and print the output
        String  arge_age_string= args[0];
        //String --> Int
        int age= Integer.parseInt(arge_age_string);
       // System.out.println(age);


        while (age >0){
            System.out.println(age);
            age--;
        }


    }
}
