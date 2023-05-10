import java.util.*;

public class Functons6 {
    public static boolean Checkprime(int n) {
        boolean Checkprime = true;
        if (n == 2) {
            System.out.println("Prime");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                Checkprime = false;
                break;

            }
        }
        return Checkprime;

    }

    public static void Primeranges(int n) {
        for (int i = 1; i <= n; i++) {
            if (Checkprime(i)) {// true
                System.out.println(" " + i);
            }
        }
    }

    public static void main(String args[]) {
        Primeranges(30);

    }
}