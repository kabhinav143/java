import java.util.*;

public class Negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String Negativity = (number >= 0) ? "postive" : "negative";
        System.out.println(Negativity);
    }
}