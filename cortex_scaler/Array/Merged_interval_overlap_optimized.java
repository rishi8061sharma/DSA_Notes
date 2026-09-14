import java.util.*;

public class Main {

    public static int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        int index = 0;

        for (int i = 1; i < intervals.length; i++) {

            // Overlapping intervals
            if (intervals[i][0] <= intervals[index][1]) {

                intervals[index][1] =
                        Math.max(intervals[index][1], intervals[i][1]);

            } else {
                // Non-overlapping interval
                index++;

                intervals[index][0] = intervals[i][0];
                intervals[index][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(intervals, index + 1);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}