import java.util.*;

public class LINEARSEARCH {
    public static int LINEAR_SEARCH(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 5, 9, 10 };
        int key = 9;
        int Index = LINEAR_SEARCH(numbers, key);
        if (Index == -1) {
            System.out.println("NOt found");
        } else {
            System.out.println("KEY AT INDEX" + Index);
        }
    }
}