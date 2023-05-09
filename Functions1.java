import java.util.*;

public class Functions1 {
    public static int CalculateSum(int num1, int num2) {// formal parameters
        Scanner sc = new Scanner(System.in);
        int sum = num1 + num2;
        System.out.println("CAlculate sum is" + sum);
        return 0;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);//arguments function call

    }
}