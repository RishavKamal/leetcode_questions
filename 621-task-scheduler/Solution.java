class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int max_freq = 0;
        int freq = 0;
        for (char i : tasks) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
            max_freq = Math.max(max_freq, mp.get(i));
        }
        for (Map.Entry<Character, Integer> i : mp.entrySet()) {
            if (i.getValue() == max_freq) {
                freq++;
            }
        }
        int ans = (max_freq - 1) * (n + 1) + freq;
        if (ans < tasks.length)
            return tasks.length;
        return ans;         
    }
}