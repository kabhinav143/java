import java.util.*;

public class GST {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter price of pen=" + a);
        float b = sc.nextFloat();
        System.out.println("Enter price of paper=" +b);
        float c = sc.nextFloat();
        System.out.println("Enter price of shapner="+ c);
        float Total = (a + b + c);
        float nw  = (float)(0.18*Total);
        System.out.println("TOTAL PRICE=" + Total);
        System.out.println("NEW VALUE=" + nw );
    }
}