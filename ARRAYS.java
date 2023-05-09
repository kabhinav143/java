import java.util.*;

public class ARRAYS {
    public static void main(String args[]) {
        int marks[] = new int[100]; // array declaration datatype name[]=new int []
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("physics=" + marks[0]);
        System.out.println("Chemistry" + marks[1]);
        System.out.println("Math" + marks[2]);
        marks[2] = 1000;// updation array
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("math" + marks[2]);
        System.out.println("percentage" + percentage);
        System.out.println("length is=" + marks.length);

    }
}