import java.util.*;

public class TAX {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int tax;
        if (salary < 500000) {
            tax = 0;
            System.out.println("Tax is" + tax);
        } else if (salary >= 500000 && salary < 1000000) {
            tax = (int) (salary * 0.20);
            System.out.println("Tax is" + tax);
        } else {
            tax = (int) (salary * 0.30);
            System.out.println("Tax is " + tax);
        }
    }
}