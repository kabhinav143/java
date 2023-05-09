import java.util.*;

public class IFELSE1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("ELIGIBLE TO VOTE");
        } else if (age >= 13 && age < 18) {
            System.out.println("TEENAGE");
        } else {
            System.out.println("NOT ELIGIBLE TO VOTE");
        }
    }
}