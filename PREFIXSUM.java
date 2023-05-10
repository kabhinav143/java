import java.util.*;

public class PREFIXSUM {
    public static void Update(int numbers[]) {
        int cuursum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // print an array
        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                cuursum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
                if (max < cuursum) {
                    max = cuursum;
                }
            }

        }
        System.out.println("max" + max);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, -1, 5, 6 };
        Update(numbers);

    }
}