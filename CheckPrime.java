import java.util.*;

public class Functons6 {
    public static boolean Checkprime(int n) {
        boolean Checkprime = true;
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                CheckPrime = flase;
                break;

            }
        }
        return Checkprime;
    }

    public static void main(String args[]) {
        System.out.println(CheckPrime(5));

    }
}