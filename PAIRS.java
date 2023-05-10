import java.util.*;

public class PAIRS {
    public static void FUNCTIONS(int numbers[]) {
        int tp=0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")" + " ");
                tp++;
            }
            System.out.println();
        }
    }
}

