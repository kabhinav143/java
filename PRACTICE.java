import java.util.*;

public class PRACTICE {
    public static int AVERAGE(int a, int b, int c) {

        int Average = (a + b + c) / 3;
        return Average;
    }

    public static boolean isEven(int n) {
        boolean isEven = false;
        if (n % 2 == 0) {
            isEven = true;
        }
        return isEven;

    }

    public static void main(String args[]) {
        System.out.println(isEven(4));

    }
}