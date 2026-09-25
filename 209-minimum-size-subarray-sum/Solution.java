class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Add the current number to our window
            sum += nums[right];

            // If the sum is enough, try making the window smaller
            while (sum >= target) {

                // Check if this is the smallest valid window so far
                minLength = Math.min(minLength, right - left + 1);

                // Remove the leftmost number and shrink the window
                sum -= nums[left];
                left++;
            }
        }

        // No valid subarray was found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

        /*
         * Time: O(n)
         * Each element is added and removed from the window at most once.
         *
         * Space: O(1)
         * We only use a few variables.
         */
    }
}