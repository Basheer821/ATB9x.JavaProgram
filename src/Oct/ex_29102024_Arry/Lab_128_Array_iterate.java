package Oct.ex_29102024_Arry;

import java.util.Arrays;

public class Lab_128_Array_iterate {
    public static void main(String[] args) {
        int[] marks={55,77,100,89,76};
        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-----------");

        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }



    }
}
