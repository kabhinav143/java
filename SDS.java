import java.util.*;

public class SDS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("Sum of even numbers" + evenSum);
        System.out.println("Sum of odd numbers" + oddSum);
    }

}