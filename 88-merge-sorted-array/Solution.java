class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> merge = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            merge.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            merge.add(nums2[i]);
        }
        Collections.sort(merge);
        for (int i = 0; i < merge.size(); i++) {
            nums1[i] = merge.get(i);
        }
    }
}