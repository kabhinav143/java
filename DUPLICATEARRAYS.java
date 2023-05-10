import java.util.*;

public class DUPLICATEARRAYS {
    public static boolean UPDATE(int nums[])

    {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 3, 5, 2, 6, 9 };
        System.out.println(" update" + UPDATE(nums));

    }
}