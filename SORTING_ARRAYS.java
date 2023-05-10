import java.util.Arrays;
import java.util.*;

public class SORTING_ARRAYS {
    public static void main(String args[]) {
        Integer arr[] = { 2, 4, 9, 8, 5 };
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
    }
}