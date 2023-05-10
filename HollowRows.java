import java.util.*;

public class HollowRows {
    public static int hollowRows(int rows, int cols) {
        // outer loop
        for (int i = 1; i <= rows; i++) {
            // inner cols
            for (int j = 1; j <= cols; j++) {
                // cells i,j
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    // boundadry cells
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
        return cols;
    }

    public static void main(String args[]) {
        System.out.println(hollowRows(4, 5));
    }
}