import java.util.*;

public class MAXSUBARRAYS1 {
    public static void UPDATE(int numbers[]) {
        int current = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i + 1; j < numbers.length; j++) {
                int end = j;
                current = 0;
                for (int k = start; k < end; k++) {
                    current = current + numbers[k];

                }
                System.out.println(current);
                if (current < largest) {
                    current = largest;
                }
            }

        }
        System.out.println(current);

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        UPDATE(numbers);
    }
}