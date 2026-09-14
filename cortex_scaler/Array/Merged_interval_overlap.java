import java.util.*;

public class Main {

    public static int[][] merge(int[][] intervals) {

        int n = intervals.length;
        boolean[] visited = new boolean[n];

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int start = intervals[i][0];
            int end = intervals[i][1];

            for (int j = i + 1; j < n; j++) {

                if (visited[j]) {
                    continue;
                }

                // Check if intervals overlap
                if (intervals[j][0] <= end &&
                    intervals[j][1] >= start) {

                    start = Math.min(start, intervals[j][0]);
                    end = Math.max(end, intervals[j][1]);

                    visited[j] = true;
                }
            }

            result.add(new int[]{start, end});
        }

        return result.toArray(new int[result.size()][]);
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