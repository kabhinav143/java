import java.util.*;

public class SWITCH {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER" + a);
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER" + b);
        int b = sc.nextInt();
        System.out.println("ENTER THIRD NUMBER" + operator);

        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a % b);
                break;
        }
    }
}