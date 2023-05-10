import java.util.*;
public class Functions2{
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String args[]){
        int a=5;
        int b=10;
        Swap(a,b);

    }
}