import java.util.*;

public class PASS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String f = (marks >= 33) ? "pass" : "Fail";
        System.out.println(f);
    }
}