import java.util.*;

public class FloydT {
    public static void FLOYD(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

    }

    public static void TRIANGLE(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        TRIANGLE(5);
        

    }
}