class Solution {
    public int minimumChairs(String s) {
        int chairs = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E')
                chairs++;
            else
                chairs--;
            max = Math.max(max, chairs);
        }
        return max;
    }
}