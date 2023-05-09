import java.util.*;

public class Palindrome {
    public static boolean palindrome(int n) {
        int palindrome=n;
        int rev = 0;

        while (n != 0) {
           int rem =  palindrome% 10;
            rev = rev + rem * 10;
            palindrome=palindrome/10;

        }
        if (n==rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int p1alindrome=sc.nextInt();
        if(palindrome)

    }
}