import java.util.*;

public class Functions4 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BINOMIAL(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);
        int bino = fact_n / (fact_r * fact_n_r);
        return bino;
    }
    public static int sum(int a,int b){
         
    }

    public static void main(String args[]) {
        System.out.println(BINOMIAL(5, 4));

    }
}