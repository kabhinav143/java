import java.util.*;

public class DIgits {
    public static int SDIGITS(int n) {
        int sum = 0;
        int lastdigit = 0;
        while (n > 0) {
            lastdigit = lastdigit % 10;
            sum = sum + lastdigit;
        }
        return sum;

    }

    public static void main(String args[]) {
        System.out.println(SDIGITS(123));

    }
}