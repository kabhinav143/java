import java.util.*;

public class ARRAY {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}