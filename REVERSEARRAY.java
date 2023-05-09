import java.util.*;

public class REVERSEARRAY {
    public static int REVERSE_ARRAY(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        REVERSE_ARRAY(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}