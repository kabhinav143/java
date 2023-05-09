import java.util.*;

public class Binary {
    public static void Binotodec(int binonum) {
        int pow = 0;
        int decnm = 0;
        while (binonum > 0) {
            int lastdigit = binonum % 10;
            decnm = decnm + lastdigit * (int) (Math.pow(2, pow));
            pow++;
            binonum = binonum / 10;
        }
        System.out.println(" Binary" + binonum + "decimal" + decnm);

    }

    public static void BinotoDEC(int n ) {
        int mynum = n;
        int pow = 0;
        int binot = 0;
        while (n > 0) {
            int rem = n % 2;
            binot = binot + rem + (int) Math.pow(10, pow);
            pow++;
            n = n / 2;

        }

        System.out.println("binary form" + mynum + "mynum" + binot);

    }

    public static void main(String args[]) {
        BinotoDEC(89);
    }
}