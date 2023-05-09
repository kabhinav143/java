import java.util.*;

public class BUBBLESORT {
    public static void Bubble_Sort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = 0;
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    System.out.print(numbers[i]);

                }
            }
        }
    }

    public static void Printarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        Bubble_Sort(numbers);

    }
}