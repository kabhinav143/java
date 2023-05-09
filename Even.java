import java.util.*;

public class Even {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt(); 
        if (age >= 18) {
            System.out.println("vote : Drink : college");
        }
        if (age >= 13 && age < 18) {
            System.out.println("Teenage");
          } 
        else {
            System.out.println("not eligible to vote");
        }
    }
}