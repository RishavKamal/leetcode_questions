import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort by ending time so we can always keep the interval
        // that finishes earliest.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removed = 0;

        // The first interval is our starting point
        int previousEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // These two intervals overlap
            if (intervals[i][0] < previousEnd) {

                // Since the current interval ends later (or at the same time),
                // it's better to remove the current one.
                removed++;

            } else {

                // No overlap, so keep this interval
                previousEnd = intervals[i][1];
            }
        }

        return removed;

        /*
         * Time: O(n log n)
         * Sorting takes O(n log n), and the loop takes O(n).
         *
         * Space: O(log n) auxiliary space for Java's sorting,
         * excluding the input array.
         */
    }
}