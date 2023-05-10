import java.util.*;

public class INVERTEDPYRAMID {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int lines = 1; lines <= n; lines++) {
            for (int star = 1; star <= n - lines + 1; lines++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}