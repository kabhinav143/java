import java.util.*;

public class TRAPPINGRAIN {
    public static int TrappedRainwater(int height[]) {
        int n = height.length;
        // calculate left max boundaary-array
        int leftMAx[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            // calculate max array
            int rigthmax[] = new int[n];
            rightmax[n - 1] = height[n - 1];
            for (i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i + 1]);

            }
            // loop
            // water level=min(leftmax bound,rightmax)
            // trapped=waterlevel-height
            int trapppedWater = 0;
            for (int i = 0; i < n; i++) {
                trapppedWater += Math.min(leftMax[i], rightMax[i]);
            }
            return trapppedWater;
        }
    }

    public static void main(string args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        TrappedRainwater();

    }
}