import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int lines = 1; lines <= 4; lines++) {
            for (int star = 1; star <= lines; star++) {
                System.out.print(" " + "*");
            }
            System.out.println(" ");

        }
    }
}