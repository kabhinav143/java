import java.util.*;

public class Functions5 {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n -1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            System.out.println("prime is=" + i);
        }
    }return isPrime;

    }

    public static void main(String args[]) {
        System.out.println(isPrime(7));

    }
}