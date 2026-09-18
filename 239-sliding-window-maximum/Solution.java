class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});    //gives pair of value and index
            while (pq.peek()[1] <= i - k) {     //removes elements from priority queue ()
                pq.poll();
            }
            if (i >= k - 1) {                   //it keeps adding the int untill it matches the length of k
                ans[i - k + 1] = pq.peek()[0];
            }
        }
        return ans;
    }
}