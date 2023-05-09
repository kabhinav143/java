import java.util.*;

public class LINEAR_SEARCH {
    public static int LINEARSEARCH(int numbers[], int key) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println(i);
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 10, 43, 45, 66, 43, 44 };
        int key = 10;
        LINEARSEARCH(numbers, key);

    }
}