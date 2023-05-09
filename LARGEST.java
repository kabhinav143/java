import java.util.*;

public class LARGEST {
    public static int LARGEST_NUMBER(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <= numbers.length; i++) {
            if (smallest < numbers[i]) {
                smallest = numbers[i];

            }
        }
        return smallest;

    }

    public static void main(String args[]) {
        int numbers[] = { 3, 6, 90, 2, 10, 9 };
        System.out.println("LARGEST" + LARGEST_NUMBER(numbers));
    }
}