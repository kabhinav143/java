import java.util.*;

public class Loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            n = n = i * (n - 1);
            n = n + 1;

        }
        System.out.println();
    }
}