import java.util.*;
import java.util.Arrays;

public class INSERTION_SORT {
    public static void INSERTIONSORT(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out correct pos to inmsert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // INSertion array
            arr[prev + 1] = curr;
        }
    }

    public static void Printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Arr
        Printarray(arr);
    }
}