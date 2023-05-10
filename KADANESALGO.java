import java.util.*;

public class KADANESALGO {
    public static void UPDATE(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;

            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max array" + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, -4, -9, 8 - 4 };
        UPDATE(numbers);

    }
}