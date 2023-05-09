import java.util.*;

public class SELECTION_SORT {
    public static void SELECTIONSORT(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallpos = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[smallpos] > arr[j]) {
                    smallpos = j;
                }
            }
            // swpa
            int temp = 0;
            temp = arr[smallpos];
            arr[smallpos] = arr[i];
            arr[i] = temp;
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
        SELECTIONSORT(arr);
        Printarray(arr);
    }
}