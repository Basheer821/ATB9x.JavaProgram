package Oct.ex_21102024_Forloop;

public class Lab_101 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("EVEN");
                continue;
            }
            System.out.println(i);
        }
    }
}
